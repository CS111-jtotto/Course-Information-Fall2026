**Monte Carlo Numerical Approximation of Pi**

We are measuring the area of a circle by statistical approximation.

In Lab 3, you wrote code to calculate the square root of two using a number line. You will finish the project by writing an analogous function to measure pi using the unit circle.

Generate two random variables, `x` and `y`, between -1 and 1. (Hint: Try `Math.random() * 2 - 1`.) Test `x*x + y*y <= 1` to find out which samples fall inside of the circle.

```java
public static int sampleCircle(int samples) {
    int count;
    for (int i = 0; i < samples; i += 1) {
        // ...
    }
    return count;
}
```

Calculate the `ratio` of samples inside the circle. Since the area of the region `[-1, 1] x [-1, 1]` is 4, therefore the value of pi is `ratio * 4`.

Write a function to sample the circle with 100, 1000, and 10000 samples.

For each sample count, perform the experiment 100 times; and measure the difference between each estimate and `Math.pi`. Report the average squared difference.


**3. Caesar Cipher Decrypter**

We are deciphering an encrypted text, `Week 4/example_ciper.txt`.

In Lab 3, you wrote code to decipher a text given its key. 

Write a function to calculate the occurrences of each letter in the deciphered text. Divide each count by the total length of the text, to get the statistical distribution of letters.

Write a function to sample every possible key (0 - 25), and calculate its probability distribution.

You will use the chi-squared test to compare your deciphered text against English letter probabilities, which can be read from the following table.

`double[] englishLetterProbabilities = {0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987, 0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150, 0.01974, 0.00074};`

For each letter, subtract your observed probability from the expected probability. Square the result and divide by the expected probability. The sum of weighted squares over all twenty-six letters is your chi-squared value.

Identify the likeliest decryption, first using your own judgement, then by using the chi-squared value.


**4. Markov Text Generator**

Language models, like the autocorrect on your phone, predict statistically likely tokens. The simplest example of a language model is a Markov chain.

In Lab 3, you calculated transition probabilities (with a context window of 1 ASCII character) based on the text of Moby Dick.

Write a function to continue a given String of text for `n` characters. You will need to get the last character of the text; then sample randomly from the transition probabilities, repeatedly.

In order to sample a given row (e.g. `transition['a']`) of probabilities, make a single random sample (between 0 and 1) using `double sample = Math.random()`. Take a cumulative `threshold` by iterating over the array, adding in each probability mass; and return the appropriate character when `sample <= threshold`.

