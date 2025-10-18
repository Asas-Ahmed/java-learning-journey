
---

# 🧩 Array of Objects in Java

An **Array of Objects** is used to store multiple references to objects of the same class. It's like a list where each slot holds a specific object, allowing you to manage a collection of complex data structures (like `Student` records) easily.

### 🔑 Key Concept

When you create an array of a class type (e.g., `Student[]`), you're creating an array of **references**. You must then initialize each slot with a **new object**.

### 💻 Array of Objects Example

This code demonstrates creating a `Student` class and then managing multiple `Student` objects within an array.

```java
package com.asaslabs;

class Student {
    int rollno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String a[]) {
        // 1. Create individual Student objects
        Student s1 = new Student();
        s1.rollno = 1; s1.name = "John"; s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2; s2.name = "Bob"; s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3; s3.name = "Alice"; s3.marks = 97;

        // 2. Declare and initialize an array of Student references
        Student students[] = new Student[3];
        
        // 3. Assign the created objects to the array slots
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // 4. Iterate and access object properties (Name and Marks)
        System.out.println("--- Student Records ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
```

### 💡 Output

The loop prints the name and marks for each object stored in the array:

```
--- Student Records ---
John : 88
Bob : 67
Alice : 97
```

-----

### ⚠️ Note on Exceptions

> **Exception:** A runtime error that occurs during the execution of a program. Common examples when working with arrays include `ArrayIndexOutOfBoundsException` (trying to access a non-existent index) and `NullPointerException` (trying to call a method or access a field on an array element that hasn't been initialized with an object yet, i.e., it's still `null`).