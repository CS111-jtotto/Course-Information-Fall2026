Your lab assignment for Mon, Nov 2nd is to modify the animated paintbrush you created last week. If you are interested in pixel manipulation, you are also welcome to create an animated brush; use the provided FilterBrush sandbox to test your implementation.

Take five minutes to write down what kind of shape or animation you want to create. Does the shape change over time? Is each stroke a different color?


You are free to work on your brush independently, or to share your idea. I will go around the room and collect ideas on the board, some of which we will work out in the Processing IDE.

Without replacing your Processing sketch from the previous lab, please upload the brush to your workbench. Next week, I will ask you to reflect in writing on the changes you made to the brush, and to finalize a standalone version that you will submit for Project 2. The implementation as a subclass will take place in Project 3.


Use any combination of Processing shapes, and the following RainbowShape and StarShape classes to inspire your implementation. You are welcome to use - or to not use - an LLM such as Claude, Gemini, or ChatGPT to generate a Processing implementation of your brush idea. In any case, make sure your Shape is a class with a constructor and a `display()` / `update()` function.

https://processing.org/examples/regularpolygon.html

```
// Create an ArrayList<RainbowShape> shapes, and initialize each shape like:
	// shapes.add(new RainbowShape(mouseX, mouseY, colorStep, 40));
	
// Display each shape in loop():
	// for (RainbowShape u : shapes) { u.display(); }

class RainbowShape {
  float x, y;
  float size;
  float r, g, b;
  
  RainbowShape(float x, float y, float step, float size) {
    this.x = x;
    this.y = y;
    this.size = size;
    
    // Calculate RGB values at the exact moment the shape is created
    this.r = sin(step) * 127 + 128;
    this.g = sin(step + TWO_PI / 3) * 127 + 128;
    this.b = sin(step + TWO_PI / 3 * 2) * 127 + 128;
  }
  
  void display() {
    noStroke();
    fill(r, g, b);
    circle(x, y, size);
  }
}
```

```
// Create an ArrayList<StarShape> shapes, and initialize each shape like:
	// shapes.add(new StarShape(mouseX, mouseY, starSize, starColor));
	
// Display each shape in loop():
	// for (StarShape u : shapes) { u.update(); u.display(); }
	
class StarShape {
  float x, y;
  float outerRadius, baseInnerRadius;
  float currentInnerRadius;
  int points;
  color c;
  
  float pulseAngle;
  float pulseSpeed;
  
  StarShape(float startX, float startY, float size, color startColor) {
    x = startX;
    y = startY;
    outerRadius = size;
    baseInnerRadius = size * 0.4; // The average inner radius
    points = 5;
    c = startColor;
    
    pulseAngle = random(TWO_PI);     // Start the pulse at a random phase
    pulseSpeed = random(0.05, 0.2);  // How fast the star breathes in and out
  }
  
  void update() {
    pulseAngle += pulseSpeed;
    
    // Use sine to oscillate the inner radius by up to 25% of the outer radius.
    // This makes the star alternate between spiky and thick.
    currentInnerRadius = baseInnerRadius + sin(pulseAngle) * (outerRadius * 0.25);
  }
  
  void display() {
    pushMatrix();
    translate(x, y);
    fill(c);
    
    float angle = TWO_PI / points;
    float halfAngle = angle / 2.0;
    
    beginShape();
    for (float a = -HALF_PI; a < TWO_PI - HALF_PI; a += angle) {
      // Outer point stays fixed
      float sx = cos(a) * outerRadius;
      float sy = sin(a) * outerRadius;
      vertex(sx, sy);
      
      // Inner point pulses
      sx = cos(a + halfAngle) * currentInnerRadius;
      sy = sin(a + halfAngle) * currentInnerRadius;
      vertex(sx, sy);
    }
    endShape(CLOSE);
    
    popMatrix();
  }
}
```