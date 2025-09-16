
---

# 🫀 Anatomy of a Java Program

---

- Smallest building block in java programs are functions
  - A block of code that performs a task

```java
ReturnType Name() {
    ...
}
```
> **Note:** Here returnType is **void**; Name() for example sendEmail(); (...) here we can write parameters to pass values to our function (who is the receiver, subject of the email); {...} is where we write java code.

- Java program should have at least one function and that function is called **main**; it is the entry point of the program.

- It belong to the class. **Class** is a container for one or more related functions. basically we use these classes to organize our code.

```java
class Main {
    void main() {
        ...
    }
}
```

- A **method** is a function that is part of a class. When a function belongs to a class we refer to it as a **method of that class**.
  
- All these classes and methods should have an **access modifier** an access modifier is a special keyword that determines if other classes and methods in this program can access these classes and methods we have various access modifiers like public, private...

```java
public class Main {
    public void main() {
        ...
    }
}
```

- PascalNamingConvention - **Classes**
- camelNamingConvention - **Methods**