
---

# **Conditional Statements (If/Else)** 🚦

These statements allow a program to **make decisions** and execute different code blocks based on whether a condition is True or False.

  * **`if`**: Executes a block if the first condition is True.
  * **`else if`** (`elif` in other languages): Checks a secondary condition only if the previous `if` (or `else if`) was False.
  * **`else`**: Executes if *all* preceding conditions were False.

#### **Code Example**

The program checks the `temp` ($32$) against the conditions. Since $32 > 30$ is True, the first block executes and the rest are ignored.

```java
int temp = 32;

if (temp > 30) {
    System.out.println("It's a hot day");
    System.out.println("Drink water");
}
else if (temp > 20) // Ignored because the first 'if' was true
    System.out.println("Beautiful day");
else // Ignored
    System.out.println("Cold day");
```

**Output**

```
It's a hot day
Drink water
```

-----

### **Simplifying If Statements** 💡

You can often simplify complex conditional checks by **storing the Boolean result** of a comparison in a descriptive variable. This makes the code cleaner and easier to read.

| Complex Check | Simplified Check |
| :--- | :--- |
| `if (income > 100_000)` | `if (hasHighIncome)` |

#### **Code Example**

```java
int income = 120_000;
// Instead of using the full expression repeatedly, we create a boolean variable:
boolean hasHighIncome = (income > 100_000); 
// hasHighIncome is now 'true'
```

-----