### Lab 3: Monte Carlo Sampling

Let's write code from scratch to calculate `sqrt(2)`, the square root of 2, using the number line.

For the project, you're going to measure a circle, as described in lecture previously. For now, let's start with the number line, which can be sampled using a single random variable.

We happen to know the square root of 2 is between one and two, since 1\*1 = 1 (which is less than 2) and 2\*2 = 4 (which is more than 2). Therefore, sampling the interval between 0 and 2 lets us calculate the area of the interval between 0 and `sqrt(2)`, which is the value of `sqrt(2)`.

---

Create a new file `MonteCarloLine.java` that defines a class and `main()` method.

Declare a variable `count` so that we can count how many samples fall inside the test interval. What is the type of `count`?

Use a `for` loop to generate 1000 random samples using `Math.random()`.

First, assign the sample to a variable `x`. What is the type of `x`?

Next, test whether `x * x < 2.0`; if it does, add one to `count`.

Finally, divide `count` by 1000 (the number of samples) and multiply by 2 (the area of the sample interval).

Hint: Be careful of integer division; make sure your expression calculates a `double`, by casting `(double) count` or using the double literal `1000.0`.

---

Upload commented code to your workbench. In a separate text or Markdown file (.txt or .md), answer the following questions, making modifications to your code as necessary:

1. Measure the accuracy of your estimate, up to double precision. Subtract your result from `Math.sqrt(2)`, the built-in square root method, to calculate the error.

2. What happens to the error as you change the number of samples? Parameterize the number of `samples` and change it from 1000 to 100, or to 10000.