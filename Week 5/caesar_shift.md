### Lab 3: Caesar Shift

Let's write code from scratch to offset each character in a ciphered text.

The Caesar encoding is a weak cryptographic method. Ciphered texts can be decoded using an integer between 1 and 26, representing the offset of each character (e.g. a key of 2 implies the translation table: a -> c, b -> d, and so forth).

For the project, you're going to try all 26 possibilities and rank them by statistical likelihood. On modern computers, this is a fast process; much faster than it would be by hand. For now, let's implement the decoding step.

---

Create a new file `MonteCarloLine.java` that defines a class and `main()` method.

Given a String of ciphered `text`, you can produce an equivalent character array using `text.toCharArray()`.

Use the array's `length` property to initialize an empty parallel array of the same length, where we'll store the shifted output.

Iterate over each character in the array, declaring a `for` loop which increments the array index `i`.

Normalize the ASCII character to an integer between [0, 25]. If it is lower-case, you can subtract `a` to get this offset; or if it upper-case, you can subtract `A`.

Use modular arithmetic (`offset % 26`) to shift each character by some integer `key`. Don't forget to convert them back to letters, using `a` or `A` as an integer offset.

Output the resulting 'deciphered' text to the console.

---

Upload commented code to your workbench. In a separate text or Markdown file (.txt or .md), answer the following questions, making modifications to your code as necessary:

1. Try parameterizing `key` so that you can attempt all 26 possibilities without re-compiling the program. You can do this as a method argument, and/or by using `args[0].parseInt()` to handle command-line input.

2. What is the encoded phrase in `Week\ 4/example_cipher.txt`, and what is its `key` shift? 