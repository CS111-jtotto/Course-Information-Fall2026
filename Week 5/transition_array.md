### Week 3: Markov Chain Transition Array

For the project, you will generate text based on statistical probabilities. The oldest and simplest method of predicting text is by looking at the previous character, and consulting a 'transition matrix'.

---

Following instructions from lecture 

---

1. 


            int currentChar;
            while ((currentChar = reader.read()) != -1) {
                // Filter to ensure characters fit within the standard ASCII range
                if (prevChar >= 0 && prevChar < SIZE && currentChar >= 0 && currentChar < SIZE) {
                    transitionCounts[prevChar][currentChar]++;
                    totalTransitions++;
                }
                prevChar = currentChar;
            }