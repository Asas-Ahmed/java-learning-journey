
---

# **For Loops** 🔁

A `for` loop is used for **iteration**—repeating a block of code a **known, fixed number of times**. It's ideal for cycling through ranges or sequences.

#### **Syntax (Java)**

A `for` loop has three parts inside the parentheses, separated by semicolons:

1.  **Initialization**: Runs **once** at the start (e.g., `int i = 0`).
2.  **Condition**: Checked **before** each iteration; the loop runs as long as it's True (e.g., `i < 5`).
3.  **Increment/Decrement**: Runs **after** each iteration (e.g., `i++`).

#### **Code Example 1: Basic Repetition**

This loop runs $5$ times, with the counter `i` going from $0$ up to (but not including) $5$.

```java
for (int i = 0; i < 5; i++)
  System.out.println("Hello World");
```

**Output**

```
Hello World
Hello World
Hello World
Hello World
Hello World
```

#### **Code Example 2: Counting Up**

This loop runs $5$ times, with the counter `i` going from $1$ up to $5$, printing the current count.

```java
for (int i = 1; i <= 5; i++)
  System.out.println("Hello World " + i);
```

**Output**

```
Hello World 1
Hello World 2
Hello World 3
Hello World 4
Hello World 5
```

#### **Code Example 3: Counting Down**

This loop runs $5$ times, starting `i` at $5$ and decreasing it until it's no longer greater than $0$.

```java
for (int i = 5; i > 0; i--)
  System.out.println("Hello World " + i);
```

**Output**

```
Hello World 5
Hello World 4
Hello World 3
Hello World 2
Hello World 1
```

-----