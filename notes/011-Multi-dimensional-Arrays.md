
---

# 📐 Java Multi-dimensional Arrays (Grids)

---

A **multi-dimensional array** is simply an **array of arrays**, most often represented as a **2D grid** (rows and columns).

| Key Fact | Description |
| :--- | :--- |
| **Concept** | Ideal for modeling tables, matrices, or game boards. |
| **Printing** | Must use `Arrays.deepToString()` for proper formatting. |
| **Import** | Requires `import java.util.Arrays;` |

-----

## 🏗️ Declaration and Access

A 2D array is declared using two sets of brackets, `[][]`.

### 1\. Pre-allocating Size (`[Rows][Columns]`)

This creates a grid where all values default to `0` (for `int`).

```java
int[][] numbers = new int[2][3]; // 2 rows, 3 columns
numbers[0][0] = 1;              // Access via [row_index][column_index]

System.out.println(Arrays.deepToString(numbers));
```

**Output:**

```
[[1, 0, 0], [0, 0, 0]]
```

### 2\. Initializing with Values (Nested Braces)

Each inner set of `{}` represents a new **row**.

```java
int[][] numbers = {{1, 2, 3}, {4, 5, 6}}; // 2 rows, 3 columns

System.out.println(Arrays.deepToString(numbers));
```

**Output:**

```
[[1, 2, 3], [4, 5, 6]]
```

-----

## 🔄 Iteration: Looping Through the Grid

To process every element in a 2D array, you use **nested loops**.

### 1\. Traditional `for` Loop (Index-Based)

You use one loop for the **rows** (`i`) and an inner loop for the **columns** (`j`).

```java
// Setting up the 3x4 grid with random numbers (0-10)
int nums[][] = new int[3][4];

for (int i=0; i<3; i++) { // Outer loop: Rows
    for (int j=0; j<4; j++) { // Inner loop: Columns
        nums[i][j] = (int)(Math.random() * 11); // Fill with random data
    }
}

// Printing the grid using the index-based loop
for (int i=0; i<3; i++) {
    for (int j=0; j<4; j++) {
        System.out.print(nums[i][j] + " ");
    }
    System.out.println(); // Newline after each row
}
```

### 2\. Enhanced `for` Loop (Cleaner Syntax) ✨

This is the preferred way to read array elements.

  * The outer loop iterates over each **row array** (`n`).
  * The inner loop iterates over each **element** (`m`) inside that row array (`n`).

<!-- end list -->

```java
// Printing the grid using the enhanced for loop
for (int n[] : nums) { // n is an individual row array
    for (int m : n) { // m is an individual element in that row
        System.out.print(m + " ");
    }
    System.out.println();
}
```

### Sample Output (The random numbers will vary)

```
// Output from either loop structure will look like this:
6 3 9 1 
2 0 4 7 
10 5 8 3
```