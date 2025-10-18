
---

# 🛑 Drawbacks of Arrays in Java

While arrays are fundamental, they have significant limitations that lead developers to use **Collections** (like `ArrayList`, `Vector`, etc.) for more flexible data handling.

| Drawback | Why it Matters | Better Solution |
| :--- | :--- | :--- |
| **Fixed Size** 🧱 | Once an array is created, its size **cannot be changed** (statically allocated). If you need more or less space, you must create a new array and copy the elements. | Use `ArrayList` (dynamically resizes) |
| **Homogeneous** | An array can only store elements of the same type (e.g., all `int`, all `String`). | Use `ArrayList<Object>` or **Generics** in Collections for type safety. |
| **No Built-in Methods** | Arrays don't have built-in methods (like `add()`, `remove()`, or `indexOf()`). You have to write manual loops or use the `Arrays` utility class. | Collections provide powerful, ready-to-use methods for common operations. |

### 💻 Array Initialization Snippet

This code snippet highlights the fixed size: the array `nums` will **always** hold exactly 4 integers.

```java
package com.asaslabs;

public class Demo {
    public static void main(String a[]) {
        // The array 'nums' is fixed at a size of 4 forever.
        int nums[] = new int[4]; 
    }
}
```