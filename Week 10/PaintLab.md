Your lab assignment for Mon, Oct 26th is to write a paint brush in Processing.

Follow steps 1 - 4 to create your own paint brush. For Project 1, you will either build on step 5 to create an animated rendering of the brush, or develop a filter brush according to instructions.

1. In the Processing IDE, write a `setup()` function that creates a blank `size()` 800 x 600 canvas. Create an `ArrayList<Shape> marks`, which will represent each brush-stroke you have painted with the mouse.

In a second file, create a class `Shape` with a single field, `PVector pt`. The `PVector point` has two **fields**: the X position `point.x`, and the Y position `point.y`.

In the **class constructor**, 
`
class Shape {
    // declare fields here

    Shape (int x, int y) {
        // initialize fields
    }
}


2. Write a `draw()` function that refreshes the `background()`. It paints a circle of 5 pixels in diameter at each `Shape ` in `marks` using the for-each loop syntax:

```
draw() {
    int i = 0;
    while (i < marks.size()) {
        shape = marks.get(i);
        ellipse(shape.point.x, shape.point.y, 5, 5);
        i += 1;
    }
}
```

3. Now the sketch knows how to draw Shapes, but it doesn't know where any of the Shapes are yet. Let's use your mouse to insert new shapes on the canvas.

Append a new Shape at the current mouse position `mouseX, mouseY` (provided on each frame by Processing) to the list of `marks` each frame.
```
draw() {
    marks.add(new Shape(mouseX, mouseY));

    // ... rest of drawing code
}
```
Right now, new brushstrokes are added whenever your mouse cursor passes over the canvas.

Guard the `marks.add` call with an `if (mouseDown)` block, so that brushstrokes only appear when you click and hold the left mouse button down.

4. Change the fill color, stroke color, and stroke width of each ellipse. Use the `fill`, `stroke`, and `strokeWeight` methods documented in the Processing API:

https://processing.org/reference/fill_.html
https://processing.org/reference/stroke_.html
https://processing.org/reference/strokeWeight_.html

5. (optional) Inside of your `Shape` class, define a new method to `render()` the shape. Move your `ellipse` drawing and styling code into the `render()` function, so that you can rewrite the `draw()` method:

```
for (Shape shape : marks) {
    shape.render();
}
```
