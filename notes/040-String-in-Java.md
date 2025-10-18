
---

# 🔗 What is String in Java?

A **String** in Java is a sequence of characters. It's unique because, although it's an **Object**, it is treated almost like a primitive data type for convenience.

### 🔑 Key Characteristics

| Characteristic | Description |
| :--- | :--- |
| **Immutability** | Strings are **immutable**. Once created, a String object's content cannot be changed. Any operation (like concatenation) that seems to modify a String actually creates a **brand-new** String object. |
| **Class** | It belongs to the `java.lang.String` class. |
| **Literal Creation** | Can be created using a literal (e.g., `String name = "John";`), which is the preferred way. |

-----

## 🧠 String in the JVM (Memory Model)

The Java Virtual Machine (JVM) handles String objects in a special way for efficiency:

| JVM Area | Role | Example Reference |
| :--- | :--- | :--- |
| **Stack** | Stores the **reference variable** itself. | `name` variable holds the address `105`. |
| **Heap** | Stores the **actual String object** data. | Address `105` holds the data `"John"`. |
| **String Pool** | A special area within the Heap where **String literals** are stored and reused. This saves memory. | When `String name = "John";` is used, the JVM first checks the pool. If `"John"` exists, it reuses the reference; otherwise, it creates it. |

**Visual Model:**

| Memory Location | Content |
| :--- | :--- |
| **Stack** | `name` $\rightarrow$ `105` |
| **Heap (String Pool)** | `105` $\rightarrow$ `"John"` (Actual Data) |

-----

## 💻 String Operations Example

This code demonstrates how to create a String using the literal method and use some common built-in methods.

```java
package com.asaslabs;

public class Demo {
    public static void main(String a[]) {
        // Preferred way to create a String (uses String Pool)
        String name = "John"; 

        System.out.println("hello " + name); // Concatenation
        
        // charAt(index): Returns the character at the specified index (0-based)
        System.out.println(name.charAt(0)); 
        
        // concat(str): Creates and returns a NEW String object
        System.out.println(name.concat(" Bro")); 
        
        // hashCode(): Returns the hash code for the String
        System.out.println(name.hashCode()); 
    }
}
```

### 💡 Output

The output shows the use of the methods:

```
hello John
J
John Bro
2300099
```

*(Note: Hash Code value may vary across JVM runs but is consistent for the same String value.)*