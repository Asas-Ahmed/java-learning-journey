
---

# **Control Flow Statements (Break/Continue)** 🛑

These keywords give you fine-grained control over how a loop executes by allowing you to **jump out** of a loop or **skip** the current iteration.

| Keyword | Function | Effect |
| :---: | :---: | :---: |
| **`break`** | Stops the loop | Immediately **terminates** the entire loop and moves execution to the statement *after* the loop. |
| **`continue`** | Skips current iteration | Immediately **skips** the remaining code in the loop body and proceeds to the **next** iteration. |

#### **Code Example 1: Stopping the Loop with an `if` condition**

This achieves the effect of stopping the loop *without* using `break`. The condition `if (!input.equals("quit"))` prevents "quit" from being printed.

```java
// Logic: If input is not "quit", print it. Loop stops because `while` condition becomes false on the next check.
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")) {
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    if (!input.equals("quit"))
        System.out.println(input);
}
```

**Output**

```
Input: 1
1
Input: 2
2
Input: 3
3
Input: quit
```

#### **Code Example 2: Stopping the Loop with `break`**

This is the standard, cleaner way to **exit a loop prematurely**. When `input` is "quit", `break` immediately terminates the `while` loop.

```java
// Logic: Read input. If it's "quit", BREAK the loop immediately. Otherwise, print it.
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")) {
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    if (input.equals("quit"))
        break; // Exit loop here
    System.out.println(input);
}
```

**Output**

```
Input: 1
1
Input: 2
2
Input: 3
3
Input: quit
```

#### **Code Example 3: Skipping Iterations with `continue`**

When `input` is "pass", `continue` **skips** the `System.out.println(input);` line below it and jumps back to the start of the `while` loop to ask for input again.

```java
// Logic: If input is "pass", CONTINUE to next iteration (skip printing). If "quit", BREAK. Otherwise, print.
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")) {
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    if (input.equals("pass"))
        continue; // Skips to next iteration
    if (input.equals("quit"))
        break;
    System.out.println(input);
}
```

**Output**

Notice how the `pass` inputs result in the next prompt appearing, but no number is printed.

```
Input: 1
1
Input: 2
2
Input: pass
Input: pass
Input: quit
```

#### **Code Example 4: Infinite Loop with `break`**

Using `while (true)` creates an **infinite loop**, which must rely on an internal **`break`** statement to terminate execution. This structure is often cleaner for complex exit conditions.

```java
// Logic: The loop runs forever (while true) until the 'quit' condition is met and BREAK is executed.
Scanner scanner = new Scanner(System.in);
String input = "";
while (true) { // Infinite Loop
    System.out.print("Input: ");
    input = scanner.next().toLowerCase();
    if (input.equals("pass"))
        continue;
    if (input.equals("quit"))
        break; // Essential exit condition
    System.out.println(input);
}
// Output is the same as Example 3
```

-----