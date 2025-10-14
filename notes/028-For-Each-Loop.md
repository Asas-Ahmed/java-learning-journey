
---

# **For-Each Loop (Enhanced For Loop)** 🍎🥭🍊

The For-Each Loop is a simplified loop designed exclusively for **iterating over elements in arrays or collections** (like lists). It's cleaner than a standard `for` loop because you don't manage the index.

| Loop Type | Purpose | Index Management |
| :---: | :---: | :---: |
| **Standard `for`** | General use (counting, complex patterns) | You **must** manage the index (`i`). |
| **`for-each`** | Iterating through all elements | **No index** is used; it simplifies reading. |

#### **Code Example 1: Standard `for` Loop**

This uses an index (`i`) to access each element of the `fruits` array sequentially.

```java
String[] fruits = {"Apple", "Mango", "Orange"};

for (int i = 0; i < fruits.length; i++)
    System.out.println(fruits[i]);
```

**Output**

```
Apple
Mango
Orange
```

#### **Code Example 2: For-Each Loop (Recommended)**

This automatically retrieves each `fruit` element from the `fruits` array without needing an index variable.

```java
String[] fruits = {"Apple", "Mango", "Orange"};

for (String fruit : fruits)
    System.out.println(fruit);
```

**Output**

```
Apple
Mango
Orange
```

#### **Code Example 3: Standard `for` Loop (Reverse Iteration)**

A standard `for` loop is necessary if you need to iterate in **reverse** or skip elements, as `for-each` always goes forward.

```java
String[] fruits = {"Apple", "Mango", "Orange"};

for (int i = fruits.length - 1; i >= 0; i--)
    System.out.println(fruits[i]);
```

**Output**

```
Orange
Mango
Apple
```

-----