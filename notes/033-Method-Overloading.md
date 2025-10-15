
---

# Method Overloading in Java

**Method Overloading** is a feature that allows a class to have **multiple methods with the same name** but with **different parameter lists**. It's a key part of **Polymorphism** (specifically, Compile-Time Polymorphism).

### Key Rules for Overloading

Methods are considered overloaded if they satisfy **one or both** of these conditions:

1.  **Different Number of Parameters:** (e.g., `add(n1, n2)` vs. `add(n1, n2, n3)`)
2.  **Different Data Types of Parameters:** (e.g., `add(int n1, int n2)` vs. `add(double n1, int n2)`)

> 💡 **Important:** The **return type alone** (e.g., changing from `int` to `double`) is **NOT** enough to overload a method.

-----

### 📝 Java Example: Overloading the `add` Method

The `Calculator` class below defines three distinct `add` methods, allowing the programmer to use the same, intuitive name for different addition tasks.

#### **The Code**

```java
package com.asaslabs;

class Calculator
{
    // Overload 1: Two integer parameters
    public int add (int n1, int n2)
    {
        return n1 + n2;
    }
    
    // Overload 2: Three integer parameters (Different number of arguments)
    public int add (int n1, int n2, int n3) 
    {
        return n1 + n2 + n3;
    }
    
    // Overload 3: One double and one integer parameter (Different types of arguments)
    public double add (double n1, int n2)
    {
        return n1 + n2;
    }
}

public class Demo
{
    public static void main(String a[])
    {
        Calculator obj = new Calculator();
        
        // The compiler automatically picks Overload 1 (int, int)
        int r1 = obj.add(3, 4); 
        System.out.println(r1);
        
        // Example calls for other overloads:
        // int r2 = obj.add(1, 2, 3);
        // double r3 = obj.add(5.5, 2);
    }
}
```

#### **The Output**

When `obj.add(3, 4)` is called, the compiler finds the method matching **two integer arguments** (`Overload 1`).

```
7
```