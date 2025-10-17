
---

# 📝 Java Arrays

Arrays are a core data structure in Java used to store multiple values of the **same data type** under a single variable name.

| Key Fact | Description |
| :--- | :--- |
| **Fixed-Length** | Once created, an array's size **cannot be changed**. |
| **Indexing** | Elements are accessed using a **zero-based index** (0, 1, 2...). |

To easily print and manipulate arrays, we often use methods from the `java.util.Arrays` class:

```java
import java.util.Arrays;
```

-----

## 🏗️ Creation and Initialization

There are two main ways to create an array:

### 1\. Pre-allocating Size (Fixed Capacity)

This allocates a size and assigns default values (`0` for `int`).

```java
int[] numbers = new int[5]; // Array of size 5
numbers[0] = 1;
numbers[1] = 2;

System.out.println(Arrays.toString(numbers));
```

**Output:**

```
[1, 2, 0, 0, 0]
```

### 2\. Initializing with Values (Dynamic Size)

The size is determined by the number of elements provided.

```java
int[] numbers = {2, 3, 5, 1, 4};

System.out.println(Arrays.toString(numbers));
```

**Output:**

```
[2, 3, 5, 1, 4]
```

-----

## 🛠️ Properties and Utility Methods

| Property/Method | Usage | Output | Purpose |
| :--- | :--- | :--- | :--- |
| **Length** | `numbers.length` | `5` | Gets the total number of elements. |
| **Sorting** | `Arrays.sort(numbers);` | `[1, 2, 3, 4, 5]` | Arranges elements in ascending order. |

-----

## 🔄 Iteration: Looping Through Elements

You typically use a **`for` loop** to process every element in an array from start to end, relying on the `length` property.

### Example Code

```java
package com.asaslabs;

public class Demo {
    public static void main(String a[]) {
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // Loop from index 0 up to (but not including) nums.length (4)
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
```

### Output

```
4
8
3
9
```