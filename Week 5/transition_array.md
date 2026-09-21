### Week 3: Markov Chain Transition Array

For the project, you will generate text based on statistical probabilities. The oldest and simplest method of predicting text is by looking at the previous character, and consulting a 'transition matrix' A[i][j]: the probability of seeing character `j` if the last character was `i`.

---

Follow instructions during lecture.

---

1. Count the total entries for each row.

2. Use a nested for loop to convert your int[][] of counts to a double[][] of probabilities, such that each row sums to 1.