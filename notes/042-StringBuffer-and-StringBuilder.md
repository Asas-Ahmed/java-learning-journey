
---

# 🔄 StringBuffer and StringBuilder in Java

Both `StringBuffer` and `StringBuilder` are classes used when you need a **mutable** sequence of characters (a string that can be changed without creating a new object every time). They offer methods to efficiently perform modifications like append, insert, and delete.

### 🔑 Key Difference (Thread Safety)

The main distinction lies in their thread-safety and performance:

| Feature | `StringBuffer` | `StringBuilder` |
| :--- | :--- | :--- |
| **Mutability** | Mutable | Mutable |
| **Thread Safety** | **Thread-Safe** (Synchronized methods) | **Not Thread-Safe** (Asynchronous) |
| **Performance** | Slower (due to synchronization overhead) | **Faster** (no synchronization) |
| **Usage** | Use in **Multi-threaded** environments. | Use in **Single-threaded** environments (most common). |

-----

### 💻 `StringBuffer` Example (Mutability)

This code demonstrates how a `StringBuffer` object can be modified in place. Notice how we use methods like `append` and `insert`.

```java
package com.asaslabs;

public class Demo {
    public static void main(String a[]) {
        // 1. Initialize a mutable string buffer
        StringBuffer sb = new StringBuffer("John"); 

        // 2. Append: adds " Bro" to the end of the existing object.
        sb.append(" Bro"); 
        
        // 3. Insert: adds "Java " at index 5.
        // String is currently "John Bro" (Indices: 01234567)
        sb.insert(5, "Java "); 
        
        // 4. Print the final, modified buffer
        System.out.println(sb);
    }
}
```

### 💡 Output

The output shows the single object has been modified multiple times:

```
John Java Bro
```

-----

### 📐 Important Methods

| Method | Purpose | Example |
| :--- | :--- | :--- |
| `append()` | Adds characters to the end. | `sb.append("End")` |
| `insert()` | Adds characters at a specific index. | `sb.insert(0, "Start")` |
| `deleteCharAt()` | Removes the character at a specific index. | `sb.deleteCharAt(2)` |
| `toString()` | Converts the buffer back to an **immutable** `String`. | `String str = sb.toString()` |