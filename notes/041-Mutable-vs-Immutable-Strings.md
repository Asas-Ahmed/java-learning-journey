
---

# 🔄 Mutable vs. Immutable Strings in Java

The core concept in Java is that the standard `String` class is **Immutable**, meaning its content cannot be changed after creation. For scenarios requiring modification, Java provides **Mutable** alternatives.

### 🛡️ 1. Immutable Strings (`String`)

A standard Java `String` object, once created, cannot be modified. Any operation that seems to change it (like concatenation) actually creates a **new String object** in the Heap.

| Feature | Description |
| :--- | :--- |
| **Class** | `java.lang.String` |
| **Behavior** | **Unchangeable**. Ensures thread safety and security (important for passwords, file paths, etc.). |
| **Efficiency** | **Less efficient** for heavy modifications (lots of object creation). |

#### 💻 Immutability Example

When we concatenate, a **new** object is created, and the `name` reference is reassigned to point to the new object (`"John Bro"`). The old object (`"John"`) is left for garbage collection.

```java
// String is immutable.
String name = "John";      // Creates "John" (e.g., at address 103)
name = name + " Bro";      // Creates NEW String "John Bro" (e.g., at address 105)
                           // 'name' now points to 105.

// Output: hello John Bro
System.out.println("hello " + name); 
```

#### 🧠 String Pool & `==`

The **String Constant Pool** (a special area in the Heap) stores unique String literals and promotes reuse.

```java
String s1 = "John"; // s1 points to "John" in the pool (e.g., address 103)
String s2 = "John"; // s2 also points to the SAME "John" (address 103)

// The '==' operator compares references (memory addresses)
System.out.println(s1 == s2); // Output: true (Because s1 and s2 both point to 103)
```

-----

### 🧱 2. Mutable Strings (`StringBuffer` & `StringBuilder`)

These classes allow the content of the String object to be directly modified **without creating new objects**.

| Feature | `StringBuffer` | `StringBuilder` |
| :--- | :--- | :--- |
| **Class** | `java.lang.StringBuffer` | `java.lang.StringBuilder` |
| **Mutability** | **Changeable** (allows direct modification). | **Changeable**. |
| **Thread Safety** | **Thread-Safe** (Synchronized) $\rightarrow$ Slower. | **Not Thread-Safe** (Asynchronous) $\rightarrow$ **Faster**. |
| **Usage** | Use for multi-threaded environments. | Use for single-threaded environments (preferred for performance). |