
---

# **While Loops** ⏳

A `while` loop is used to **repeat a block of code** as long as a specified **condition remains True**. Unlike a `for` loop, a `while` loop runs for an **unknown number of times**.

#### **Code Example: Sentinel Value**

This loop continues indefinitely until the user enters the **sentinel value** (the value that stops the loop), which is `"quit"`.

```java
Scanner scanner = new Scanner(System.in); // Used for reading user input
String input = ""; 

// Loop condition: Continue as long as 'input' is NOT equal to "quit"
while (!input.equals("quit")) { 
    System.out.print("Input: ");
    input = scanner.next().toLowerCase(); // Read the next word, convert to lowercase
    System.out.println(input);
}
```

**Output**

The loop runs three times, printing the input, and then stops when the user types "quit".

```
Input: 1
1
Input: 2
2
Input: 3
3
Input: quit
quit
```

-----