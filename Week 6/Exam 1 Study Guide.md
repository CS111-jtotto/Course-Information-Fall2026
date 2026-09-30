Study Guide for Exam 1

**1\. Assignment Statements**

Here are 10 Java exercises showcasing assignment statements across int, double, boolean, and String data types, along with their expected output values.

| Type | Assignment Statement(s) | Expected Value | Notes |
| :---- | :---- | :---- | :---- |
| int | int result \= 5 \+ 3 \* 2; |  | Multiplication takes precedence over addition. |
| double | double result \= 15 / 2.0; |  | Floating-point division preserves the decimal. |
| String | String result \= "Hello " \+ "World\!"; |  | String concatenation joins the text fragments. |
| int | int result \= 17 % 5; |  | The modulus operator returns the remainder of $17/\ 5$, an integer between 0 and 4\. |
| double | double result \= 10.0; result \+= 4.5; |  | Compound assignment adds 4.5 to the current value. |
| String | String result \= "Score: " \+ 21; |  | The integer is automatically converted and concatenated. |
| int | char input \= 'a';int result \= (int) input;  |  | ASCII coded characters have integer values between 0 \- 255:[https://www.asciitable.com/](https://www.asciitable.com/) |

**2\. Branching control flow**

Here are Java exercises designed to test your understanding of branching (if, else if, else) control flow. They incorporate int, double, boolean, and String data types along with their expected output values.

### **Door access**

int age \= 20;  
boolean hasPermission \= true;  
String entry \= "Denied";

if (age \>= 18\) {  
    if (hasPermission) {  
        entry \= "Granted";  
    }  
}  
**value of \`entry\`:** 

type of \`entry\`:

### **Thermometer**

double temperature \= 98.6;  
String status;

if (temperature \> 100.4) {  
    status \= "Fever";  
} else if (temperature \>= 97.0) {  
    status \= "Normal";  
} else {  
    status \= "Low";  
}  
**value of \`status\`:**  
type of \`status\`:

### **Safeway**

boolean isMember \= true;  
boolean hasCoupon \= false;  
double discount;

if (isMember) {  
    if (hasCoupon) {  
        discount \= 0.25;  
    } else {  
        discount \= 0.10;  
    }  
} else {  
    discount \= 0.0;  
}

**value of \`discount\`:**   
type of \`discount\`:

### **ATM**

Java  
double accountBalance \= 45.50;  
double withdrawal \= 50.00;  
boolean transactionSuccess;

if (accountBalance \>= withdrawal) {  
    transactionSuccess \= true;  
} else {  
    transactionSuccess \= false;  
}

**value of \`transactionSuccess\`:**   
type of \`transactionSuccess\`:

### **Password**

String password \= "secure";  
int strengthScore;

if (password.length() \> 8\) {  
    strengthScore \= 3;  
} else if (password.length() \> 5\) {  
    strengthScore \= 2;  
} else {  
    strengthScore \= 1;  
}

**value of \`strengthScore\`:** 

type of \`strengthScore\`: 

### **Remainder**

Java  
int number \= 14;  
boolean isEven;  
isEven \= number % 2;

**value of \`isEven\`:** 

type of \`isEven\`: 

**3\. Loops and repetition**

Here are **Java loop exercises** using primitive data types. Each exercise includes the expected output value of the designated output variable.

### **Summation**

int sum \= 0;  
for (int i \= 1; i \<= 4; i++) {  
    sum \+= i;  
}

* **Output Variable:** sum

* **Expected Value:**

### **Concatenation**

String result \= "";  
for (int i \= 3; i \>= 1; i \= i \- 1\) {  
    result \+= i \+ " ";  
}  
result \+= " Go\!";

* **Output Variable:** result

* **Expected Value:**

### **Self-reference**

String text \= "na";  
while (text.length() \< 8\) {  
    text \+= text;  
}

* **Output Variable:** text

* **Expected Value:**

### **Nested Loop Counter (for loop)**

int counter \= 0;  
for (int i \= 0; i \< 2; i++) {  
    for (int j \= 0; j \< 3; j++) {  
        counter++;  
    }  
}

* **Output Variable:** counter

* **Expected Value:** 

**4\. Advanced conditionals**

Here are Java exercises focused on writing and evaluating boolean expressions using int, double, and int\[\] types. Each exercise includes the setup variables, the boolean expression, and the expected output.

### **and &&, equal \==, not-equal \!=**

* **Given Variables:** double temp \= 98.6; int status \= 1;

* **Expression:** boolean result \= temp \== 98.6 && status \!= 0;

* **Expected Output:** 

* *Explanation:* 98.6 \== 98.6 is true. 1 \!= 0 is true. So the AND operator && returns true.

### **array.length, array indexes**

* **Given Variables:** int\[\] arr \= {1, 2, 3};

* **Expression:** boolean result \= arr.length \== 3 && arr\[0\] \== 1;

* **Expected Output:**

* *Explanation:* The array length is 3 and the first element (arr\[0\]) is 1, so both conditions are true.

### **numeric casting**

* **Given Variables:** int x \= 15; double y \= 15.0;

* **Expression:** boolean result \= x \== y

* **Expected Output:**

* *Explanation:* int and double are comparable, because Java promotes x to a double for comparison (15.0 \== 15.0 is true)

### **arithmetic**

* **Given Variables:** int\[\] data \= {5, 10, 15};

* **Expression:** boolean result \= data\[0\] \+ data\[1\] \== data\[2\];

* **Expected Output:** 

* *Explanation:* data\[0\] \+ data\[1\] equals 5 \+ 10 \= 15, which matches data\[2\] (15).

**5\. looping over arrays**

Here are **10 Java loop exercises** using int\[\], double\[\], boolean\[\], and char\[\] arrays with both for and while control flows, along with their expected output values.

### **1\. int\[\] with for Loop (Array Sum)**

int\[\] arr \= {2, 4, 6, 8};  
int sum \= 0;  
for (int i \= 0; i \< arr.length; i++) {  
    sum \+= arr\[i\];  
}

* **Output Variable (sum):** 

### **2\. int\[\] with while Loop (Even Number Count)**

int\[\] arr \= {1, 2, 3, 4, 5};  
int count \= 0;  
int i \= 0;  
while (i \< arr.length) {  
    if (arr\[i\] % 2 \== 0\) {  
        count++;  
    }  
    i++;  
}

* **Output Variable (count):** 

### **3\. double\[\] with for Loop (Maximum Value)**

double\[\] arr \= {1.5, 3.2, 2.8, 0.5};  
double max \= arr\[0\];  
for (int i \= 1; i \< arr.length; i++) {  
    if (arr\[i\] \> max) {  
        max \= arr\[i\];  
    }  
}

* **Output Variable (max):** 

### **5\. boolean\[\] with for Loop (True Value Count)**

boolean\[\] flags \= {true, false, true, true};  
int trueCount \= 0;  
for (int i \= 0; i \< flags.length; i++) {  
    if (flags\[i\]) {  
        trueCount++;  
    }  
}

* **Output Variable (trueCount):** 

### **6\. boolean\[\] with while Loop (First False Index Search)**

boolean\[\] flags \= {true, true, false, true};  
int idx \= \-1;  
int i \= 0;  
while (i \< flags.length) {  
    if (\!flags\[i\]) {  
        idx \= i;  
        break;  
    }  
    i++;  
}

* **Output Variable (idx):** 

### **7\. char\[\] with for Loop (Character Frequency)**

char\[\] letters \= {'a', 'b', 'a', 'c', 'a'};  
int countA \= 0;  
for (int i \= 0; i \< letters.length; i++) {  
    if (letters\[i\] \== 'a') {  
        countA++;  
    }  
}

* **Output Variable (countA):** 

### **9\. char\[\] with while Loop (Reverse Vowel Counter)**

char\[\] chars \= {'p', 'e', 'a', 'r'};  
int vowelCount \= 0;  
int i \= chars.length \- 1;  
while (i \>= 0\) {  
    char c \= chars\[i\];  
    if (c \== 'a' || c \== 'e' || c \== 'i' || c \== 'o' || c \== 'u') {  
        vowelCount++;  
    }  
    i--;  
}

* **Output Variable (vowelCount):** 

**6\. Method signatures**

Here are Java exercises to help you practice reading method signatures. Each exercise provides the method signature, an example invocation, and the corresponding expected return value (along with its data type).

As a further exercise, write the method body and test your implementation.

### **counting**

* **Method Signature:** public int countOccurrences(String str, char target)

* **Example Call:** countOccurrences("programming", 'g');

* **Expected Return Value:**

### **averaging**

* **Method Signature:** public double calculateAverage(int\[\] numbers)

* **Example Call:** calculateAverage(new int\[\] {10, 20, 30});

* **Expected Return Value:**

### **reversing**

* **Method Signature:** public boolean isPalindrome(String word)

* **Example Call:** isPalindrome("racecar");

* **Expected Return Value:**

* hint: for implementation, you have two options \- use String.reverse and String.equals; or walk the String.toCharArray with two iterators, int i \= 0, j \= word.length \- 1;

### **truncating**

* **Method Signature:** public String getInitials(String firstName, String lastName)

* **Example Call:** getInitials("Grace", "Hopper");

* **Expected Return Value:** 

### **returning an array in-place**

* **Method Signature:** public void doubleElements(int\[\] arr)

* **Example Call:** int\[\] seq \= new int\[\] {1, 2, 3}; doubleElements(seq);

* **Expected value in \`arr\`:** 

* hint: unlike primitive values, the contents of an array argument can be altered by a method call, and will remain altered after the method returns.

### **returning an array value** 

* **Method Signature:** public boolean\[\] checkEven(int\[\] numbers)

* **Example Call:** checkEven(new int\[\] {1, 2, 3, 4});

* **Expected Return Value:** \[false, true, false, true\] (Type: boolean\[\])

### **generate slugs**

* **Method Signature:** public String concatenate(String\[\] words, String sep)

* **Example Call:** concatenate(new String\[\] {"apple", "banana"}, "-");

* **Expected Return Value:** 

### **reduce**

* **Method Signature:** public boolean hasNegative(int\[\] numbers)

* **Example Call:** hasNegative(new int\[\] {5, 0, \-3, 8});

* **Expected Return Value:** 

**7\. Conditional repetition**

You are likely to see programs that change records in an array while traversing that array, similarly to past quiz problems. Practice writing down the program state after the loop body runs, one iteration at a time.

You will also likely see programs which measure the number of times a loop has been traversed. Sometimes the loop conditional will tell you exactly what the final value of the iterator will be; other times, a range of values are possible.

**8\. Omitted topics**

try / catch (including ArrayIndexOutOfBoundsException)

FileReader (including ‘try with resource’ pattern)

2D arrays (and 2D indexing)