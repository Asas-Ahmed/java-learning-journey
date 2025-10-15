
---

# Methods in Java 🔨

A **Method** is a block of code that performs a specific task. It's the **behavior** of a class.

| Method Component | Description | Example |
| :--- | :--- | :--- |
| **Declaration** | Defines the method signature. | `public String GetMeAPen(int cost)` |
| **Signature** | Includes the **name**, **return type**, and **parameters**. | `GetMeAPen(int cost)` |
| **Return Type** | The type of data the method gives back (or `void` if it gives back nothing). | `String` or `void` |
| **Parameters** | The values passed *into* the method to perform its job. | `int cost` |
| **Method Body** | The instructions that run when the method is called. | `if (cost >= 25) ...` |

### Key Concepts

  * **Reusability:** Methods allow you to write a block of code once and call it multiple times.
  * **Modularity:** They break down complex problems into smaller, manageable units.
  * **Calling a Method:** You need an **object** of the class to call its non-static methods (e.g., `obj.playMusic()`).

-----

### 📝 Java Example: Methods in Action

This code demonstrates a **`void` method** (`playMusic`) and a method that **returns a value** (`GetMeAPen`).

#### **The Code**

```java
package com.asaslabs;

class Computer
{
    // Method 1: No return value (void) and no parameters
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    // Method 2: Returns a String and takes an int parameter
    public String GetMeAPen(int cost)
    {
        if (cost >= 25)
            return "Pen";

        return "Nothing";
    }
}

public class Demo
{
    public static void main(String a[])
    {
        // 1. Create an Object
        Computer obj = new Computer(); 
        
        // 2. Call the void method
        obj.playMusic(); 
        
        // 3. Call the returning method and capture the result
        String str = obj.GetMeAPen(30); 
        
        // 4. Print the result
        System.out.println(str); 
    }
}
```

#### **The Output**

```
Music Playing...
Pen
```