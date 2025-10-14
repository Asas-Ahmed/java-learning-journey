
---

# **Do-While Loops** 🔁

A `do-while` loop is similar to a `while` loop, but it guarantees the code block inside the **`do`** section executes **at least once** before the **`while`** condition is checked.

| Loop Type | Execution Guarantee | When Condition is Checked |
| :---: | :---: | :---: |
| **`while`** | Zero or more times | At the **start** of each loop |
| **`do-while`** | **At least once** | At the **end** of each loop |

#### **Code Example**

The code block runs once, then the condition (`!input.equals("quit")`) is checked. The loop continues until the user types `"quit"`.

```java
// Note: Requires import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
String input = "";

do {
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    System.out.println(input);
} while (!input.equals("quit")); // Condition checked here
```

**Output**

The loop runs until "quit" is entered.

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