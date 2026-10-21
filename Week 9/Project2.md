# Project 2
### An Animated Brush

Your assignment for the next three weeks is to use the Processing canvas to design a new type of paintbrush.

You will make one of two kinds of brush: either an animated brush, or a filter brush. We will see examples of animated brushes and filter brushes next week in class; including their implementation as subclasses of the AnimatedBrush and FilterBrush classes, which I will provide.


1.
An animated brush creates a new Object of your choice wherever you drag it. You may implement an Object that wobbles in place, takes a random walk, or traces a figure; it must be animated in some fashion.

While Objects may or may not interact with other Objects of the same type, they must ignore Objects created by other brushes.

2.
A filter brush changes the appearance of objects on the canvas. You will implement the filter brush as a transformation to the pixel grid underlying the sketch, e.g. changing the colors of pixels, detecting edges, or swapping neighboring pixels.

Each additional filter brush operates on top of previous filter brushes, including itself, up to a maximum depth. Filter brushes can interact with multiple Objects, but Objects are not aware of filter brushes.



Optionally, you may choose to submit your Project 2 brush for in-class demonstration during Week 14. I will combine all of the submitted brushes into a single creative painting application, which we will mess around with in class. 

