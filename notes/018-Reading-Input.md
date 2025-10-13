
---

# 📝 Reading Input in Java (The `Scanner` Class)

---

The **`Scanner`** class is used to read input from the console.

### Setup Steps

**Step 1: Import the Class**

```java
import java.util.Scanner;
```

**Step 2: Create the Scanner Object**
You only need to create **one** `Scanner` object per program.

```java
Scanner scanner = new Scanner(System.in);
```

-----

### 1\. Reading Numbers

Use specific methods for different numeric types.

```java
System.out.print("Age: ");
byte age = scanner.nextByte();
System.out.println("You are " + age);
```

**Methods:**

  * `.nextByte()`, `.nextInt()`, `.nextDouble()`, etc.

-----

### 2\. Reading Text

| Method | Purpose | Code Example | Note |
| :--- | :--- | :--- | :--- |
| **`.next()`** | Reads a **single word**. | `String name = scanner.next();` | Stops reading at the first space. |
| **`.nextLine()`** | Reads a **full line** of text. | `String name = scanner.nextLine();` | Reads all characters, including spaces. |

**Example: Reading a Full Line**

```java
System.out.print("Full Name: ");
String name = scanner.nextLine().trim(); // Use .trim() to remove extra spaces
System.out.println("You are " + name);
```