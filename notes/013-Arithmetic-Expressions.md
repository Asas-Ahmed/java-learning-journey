
---

# Arithmetic Expressions

---

- Perform mathematical operations using operators:
    
    ```+```  (add), ```-```(subtract), ```*``` (multiply), ```/``` (divide), ```%``` (modulus/remainder)

- Integer division gives integer result; cast to ```double``` for decimals.

- Use parentheses ```()``` to control operation order.

```java
public class Main {

    public static void main(String[] args) {
        // =========================
        // Arithmetic Operations
        // =========================
        int addition = 10 + 3;          // Addition
        int subtraction = 10 - 3;       // Subtraction
        int multiplication = 10 * 3;    // Multiplication
        double division = (double)10 / (double)3; // Division (cast to double for decimal result)
        int modulusReminder = 10 % 3;   // Modulus (remainder)

        // =========================
        // Increment Operations
        // =========================
        int a = 1;
        int b = ++a;    // Pre-increment: a is incremented before assignment

        int x = 1;
        int y = x++;    // Post-increment: x is assigned first, then incremented

        // =========================
        // Compound Assignment
        // =========================
        int z = 1;
        z += 2;         // Equivalent to z = z + 2
        System.out.println(z);  // Prints 3

        // =========================
        // Print Arithmetic Results
        // =========================
        System.out.println(addition);       // 13
        System.out.println(subtraction);    // 7
        System.out.println(multiplication); // 30
        System.out.println(division);       // 3.3333333333333335
        System.out.println(modulusReminder);// 1

        // =========================
        // Print Increment Results
        // =========================
        System.out.println(a);  // 2
        System.out.println(b);  // 2

        System.out.println(x);  // 2
        System.out.println(y);  // 1
    }
}
```
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