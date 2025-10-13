
---

# 📝 Java Constants

---

A **Constant** is a variable whose value, once assigned, **cannot be changed**. They are declared using the **`final`** keyword.

### Key Points:

  * **Immutability**: The value is fixed for the lifetime of the program.
  * **Naming Convention**: Constants are traditionally named in **`UPPERCASE`** with words separated by underscores (e.g., `MAX_SPEED`).

### Code Example:

```java
// Using 'final' makes PI a constant
final float PI = 3.14F;

// Attempting to change PI here would cause a compilation error
// PI = 3.15F; 
```