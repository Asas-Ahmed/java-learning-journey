
---

# 📝 Java Arithmetic Expressions

---

Arithmetic expressions perform mathematical operations.

### 1\. Basic Operators

| Operator | Operation | Note |
| :--- | :--- | :--- |
| **`+`** | Addition | |
| **`-`** | Subtraction | |
| **`*`** | Multiplication | |
| **`/`** | Division | **Integer division** truncates decimals. Use **casting** (`(double)`) for a decimal result. |
| **`%`** | Modulus | Returns the **remainder** of a division. |

-----

### 2\. Full Code Example

This code demonstrates standard arithmetic, increment, and compound assignment operators.

```java
public class Main {

    public static void main(String[] args) {
        // --- Arithmetic Operations ---
        int addition = 10 + 3;
        double division = (double)10 / 3; // Cast one number for decimal result
        int modulus = 10 % 3; 

        // --- Increment Operations ---
        int a = 1;
        int b = ++a;    // Pre-increment: 'a' becomes 2, then 'b' gets 2.

        int x = 1;
        int y = x++;    // Post-increment: 'y' gets 1, then 'x' becomes 2.

        // --- Compound Assignment ---
        int z = 1;
        z += 2;         // Equivalent to z = z + 2
        
        // --- Print Results ---
        System.out.println(z);
        System.out.println(addition); 
        System.out.println(10 - 3); 
        System.out.println(10 * 3); 
        System.out.println(division);
        System.out.println(modulus);
        
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(x); 
        System.out.println(y);
    }
}
```

### Output

```
3
13
7
30
3.3333333333333335
1
2
2
2
1
```

-----

### 3\. Quick Operators Summary

| Type | Operator | Example | Equivalent To |
| :--- | :--- | :--- | :--- |
| **Compound** | `+=` | `z += 2` | `z = z + 2` |
| **Pre-Increment** | `++a` | `++a` | Increments **before** using the value. |
| **Post-Increment** | `a++` | `a++` | Increments **after** using the value. |