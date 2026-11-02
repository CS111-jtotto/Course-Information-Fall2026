The following code is an optional alternative to the animated brush lab assignment, if you decide to make a filter brush instead. It is optional material that will not be on the quizzes or exams.

You should feel confident in using `fill()` and `vertex()` before you take on `loadPixels()`.

This sketch uses an abstract `FilterBrush` class. Every time you drag the mouse, a new brush instance is pushed onto the `ArrayList<FilterBrush>`.

## Sandbox for Filter Brush implementations

These two files define a sandbox for FilterBrushes.

```
ArrayList<FilterBrush> brushes = new ArrayList<FilterBrush>();
int MAX_DEPTH = 150; // Maximum number of overlapping filter operations
boolean useInvert = true;

void setup() {
  size(600, 400);
}

void draw() {
  // 1. Draw the base objects (Objects are unaware of the filters)
  background(40, 40, 60);
  noStroke();
  
  fill(250, 120, 120);
  ellipse(width/2, height/2, 250, 250);
  
  fill(120, 250, 180);
  rect(100, 150, 150, 150);
  
  fill(255, 200, 50);
  triangle(400, 300, 500, 100, 600, 300);

  // 2. Apply the filter brushes to the canvas pixels
  loadPixels();
  for (FilterBrush b : brushes) {
    b.apply();
  }
  updatePixels();
  
  // UI Instructions
  fill(255);
  text("Drag to paint. Press any key to swap brush types.", 10, 20);
  text("Current Brush: " + (useInvert ? "Invert" : "Scatter"), 10, 40);
  text("Depth: " + brushes.size() + "/" + MAX_DEPTH, 10, 60);
}

void mouseDragged() {
  // Push new filter brushes onto the ArrayList
  FilterBrush newBrush;
  if (useInvert) {
    newBrush = new InvertBrush(mouseX, mouseY, 40);
  } else {
    newBrush = new ScatterBrush(mouseX, mouseY, 40);
  }
  
  brushes.add(newBrush);
  
  // Enforce maximum depth by removing the oldest brush
  if (brushes.size() > MAX_DEPTH) {
    brushes.remove(0);
  }
}

void keyPressed() {
  useInvert = !useInvert; // Toggle brush type
}
```

```
abstract class FilterBrush {
  int x, y, r;
  
  FilterBrush(int x, int y, int r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  
  abstract void apply();
}
```

## Example 1: Invert Brush
```
// Changes the colors of pixels by inverting their RGB values
class InvertBrush extends FilterBrush {
  InvertBrush(int x, int y, int r) { super(x, y, r); }
  
  void apply() {
    int startX = max(0, x - r);
    int endX = min(width - 1, x + r);
    int startY = max(0, y - r);
    int endY = min(height - 1, y + r);
    
    for (int i = startX; i <= endX; i++) {
      for (int j = startY; j <= endY; j++) {
        if (dist(x, y, i, j) <= r) {
          int loc = i + j * width;
          color c = pixels[loc];
          // Invert the pixel color
          pixels[loc] = color(255 - red(c), 255 - green(c), 255 - blue(c));
        }
      }
    }
  }
}
```

## Example 2: Scatter Brush
```
// Changes appearance by swapping a pixel with a random neighboring pixel
class ScatterBrush extends FilterBrush {
  ScatterBrush(int x, int y, int r) { super(x, y, r); }
  
  void apply() {
    int startX = max(0, x - r);
    int endX = min(width - 1, x + r);
    int startY = max(0, y - r);
    int endY = min(height - 1, y + r);
    
    for (int i = startX; i <= endX; i++) {
      for (int j = startY; j <= endY; j++) {
        if (dist(x, y, i, j) <= r) {
          // Find a random pixel within the bounding box
          int rx = (int)random(startX, endX);
          int ry = (int)random(startY, endY);
          
          // Only swap if the target is also within the brush radius
          if (dist(x, y, rx, ry) <= r) {
             int loc1 = i + j * width;
             int loc2 = rx + ry * width;
             
             // Swap the pixels
             color temp = pixels[loc1];
             pixels[loc1] = pixels[loc2];
             pixels[loc2] = temp;
          }
        }
      }
    }
  }
}
```