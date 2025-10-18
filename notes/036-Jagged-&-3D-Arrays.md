
---

# 🌟 Java Arrays: Jagged & 3D Arrays

Java allows for arrays where each row can have a different number of columns. This is a **Jagged Array**. It's essentially an "array of arrays" where the inner arrays can vary in length.

### 🖼️ Jagged Arrays (Non-Rectangular)

In a 2D array, we usually specify both dimensions: `new int[3][4]`. For a jagged array, we only specify the size of the *outer* array (the number of rows) and define the size of each *inner* array (the columns in each row) separately.

| Concept | Explanation |
| :--- | :--- |
| **Declaration** | Only the first dimension (rows) is mandatory during initial creation. |
| **Initialization** | Each row (inner array) must be initialized with its own size. |

### 💻 Jagged Array Example Code

This code creates a $3 \times n$ jagged array, assigns random numbers, and prints it.

```java
package com.asaslabs;

public class Demo {
    public static void main(String a[]) {
        // 1. Declare a 2D array, but leave the column size unspecified (Jagged)
        int nums[][] = new int[3][]; 

        // 2. Initialize each row with a different length
        nums[0] = new int[3]; // Row 0 has 3 elements
        nums[1] = new int[4]; // Row 1 has 4 elements
        nums[2] = new int[2]; // Row 2 has 2 elements

        // 3. Fill the array with random numbers (0 to 10)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                // Generates a random integer between 0 and 10
                nums[i][j] = (int)(Math.random() * 11); 
            }
        }

        // 4. Print the array using an enhanced for-loop (for-each)
        System.out.println("--- Jagged Array Output ---");
        for (int[] n : nums) { // 'n' is each row (an array)
            for (int m : n) { // 'm' is each element in the current row
                System.out.print(m + "\t");
            }
            System.out.println(); // Newline after each row
        }
    }
}
```

### 💡 Example Output

The output will vary due to `Math.random()`, but the structure will be jagged:

```
--- Jagged Array Output ---
8	10	3	
1	5	9	2	
4	7	
```

-----

## 🧊 3D Arrays

A **3D Array** is an "array of 2D arrays" or an "array of arrays of arrays." It's used to represent data with three indices (like a cube, or layers/pages of data).

| Concept | Explanation |
| :--- | :--- |
| **Structure** | Think of it as **Planes** (or blocks), **Rows**, and **Columns**. |
| **Declaration** | Requires three pairs of square brackets `[][][]`. |

### 💻 3D Array Declaration Snippet

This snippet declares a 3D array of size $3 \times 4 \times n$. The third dimension is left variable, meaning you could even create a **jagged 3D array**\!

```java
// Declares an array with 3 planes, each having 4 rows. 
// The number of columns in each row must be defined later.
int nums[][][] = new int[3][4][]; 
```