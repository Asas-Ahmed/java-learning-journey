
---

# **The Ternary Operator** (Conditional Operator) ❓

This is a **shorthand** way to write simple `if-else` statements, often used to assign a value to a variable based on a single condition.

#### **Syntax**

```
Condition ? Value_if_True : Value_if_False
```

#### **Code Example**

If `income` ($120,000$) is greater than $100,000$, assign "First" to `className`; otherwise, assign "Economy".

```java
int income = 120_000;
// income > 100_000 is True, so "First" is assigned.
String className = income > 100_000 ? "First" : "Economy";
// className is "First"
```

-----

### **Switch Statements** 🔄

A **cleaner alternative to long `if-else if-else` chains** when checking one variable against multiple fixed values.

  * It checks the value of an expression against multiple **`case`** labels.
  * The **`break`** keyword is crucial; it exits the `switch` block once a match is found, preventing "fall-through" to the next case.
  * The **`default`** case executes if none of the other cases match (similar to the final `else` block).

#### **Code Example 1: Comparing Strings**

Here, `role` is "admin", so the first `case` executes. The equivalent `if-else if` logic is shown below for comparison.

```java
String role = "admin";

switch (role) {
    case "admin":
        System.out.println("You're an admin");
        break; // Stops execution here

    case "moderator":
        System.out.println("You're a moderator");
        break;

    default:
        System.out.println("You're a guest");
        break;
}
// Output: You're an admin
```

#### **Code Example 2: Comparing Integers**

Here, `role` is $1$, so the first `case` executes.

```java
int role = 1;

switch (role) {
    case 1:
        System.out.println("You're an admin");
        break; // Stops execution here

    case 2:
        System.out.println("You're a moderator");
        break;

    default:
        System.out.println("You're a guest");
        break;
}
// Output: You're an admin
```

-----