
---

# ✨ Enhanced for Loop (For-Each Loop)

The **Enhanced for Loop** (or **For-Each Loop**) was introduced in Java 5 to simplify iterating over **arrays** and **collections**. It makes code cleaner and less error-prone by removing the need to manage counter variables and array indices.

### 📝 Syntax & Principle

The syntax is straightforward: `for (DataType element : collectionOrArray)`.

| Component | Description |
| :--- | :--- |
| **`DataType element`** | The variable that holds the current item from the array/collection during each iteration. |
| **`collectionOrArray`** | The array or collection (e.g., `ArrayList`) you want to iterate over. |

### 1️⃣ Iterating Over Primitives (Integers)

This is the cleanest way to print all values in an array:

```java
int nums[] = new int[]{4, 8, 3, 9};

// For each 'int n' in the 'nums' array, print 'n'
for (int n : nums)
{
    System.out.println(n);
}
```

**Output:**

```
4
8
3
9
```

-----

### 2️⃣ Iterating Over Objects

The enhanced loop is especially useful for collections of **objects**, making the code highly readable.

```java
package com.asaslabs;

class Student {
    // ... fields rollno, name, marks ...
    int marks;
    String name; 
}

public class Demo {
    public static void main(String a[]) {
        // ... Student objects s1, s2, s3 are created and initialized ...
        Student s1 = new Student(); s1.name = "John"; s1.marks = 88;
        Student s2 = new Student(); s2.name = "Bob"; s2.marks = 67;
        Student s3 = new Student(); s3.name = "Alice"; s3.marks = 97;

        Student students[] = {s1, s2, s3};

        // For each 'Student stud' object in the 'students' array
        for (Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
```

**Output:**

```
John : 88
Bob : 67
Alice : 97
```

-----

### ⚠️ Limitation

The main limitation is that you **cannot modify the array elements** themselves (like swapping or changing the size) or know the **index** of the element easily, as the loop hides the index counter. For index-based operations, you still need a standard `for` loop.