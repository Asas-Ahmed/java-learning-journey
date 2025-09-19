
---

# Anatomy of a Java Program

---

* **Class** → Container for related methods and variables (organizes code).

```java
public class Person {
    ...
}
```

* **Object** → Instance of a class.

```java
Person p = new Person(); // creates an object of class Person
```

* Think of a class as a **blueprint**, and the object as a **real house built from that blueprint**.

- **Field / Attribute / Property** → Variables that belong to a class or object.

```java
public class Person {
    String name; // field
    int age;     // field
}
```

* **Method / Function** → Block of code that performs a task.

```java
void sayHello() {
    System.out.println("Hello!");
}
```

* **Method vs Function** → In Java, functions inside a class are called **methods**.

- **Constructor** → Special method used to create and initialize objects.

```java
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```

* **main Method** → Entry point of every Java program.

```java
public class Main {
    public static void main(String[] args) {
        ...
    }
}
```

* **Access Modifiers** → Control visibility of classes, fields, and methods.

  * `public` → Accessible everywhere
  * `private` → Accessible only inside the class
  * `protected` → Accessible in the same package or subclasses

* **Static vs Instance**

  * `static` → Belongs to the **class**, shared by all objects
  * Non-static → Belongs to **individual objects**

* **Naming Conventions**:

  * `PascalCase` → Classes (`MainClass`)
  * `camelCase` → Methods and variables (`sendEmail`, `age`)

---

✅ **Extra Tips:**

* Always keep **fields private** and access them via **getter/setter methods** for safety.

* Objects let you **reuse code** and model real-world entities.

---