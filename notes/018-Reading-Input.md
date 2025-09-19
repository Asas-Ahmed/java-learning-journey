
---

# Reading Input in Java

---

* **Step 1:** Import Scanner

```java
import java.util.Scanner;
```

* **Step 2:** Create Scanner object

```java
Scanner scanner = new Scanner(System.in);
```

---

### 1️⃣ Reading Numbers

```java
System.out.print("Age: ");
byte age = scanner.nextByte();
System.out.println("You are " + age);
```

* Use `.nextByte()`, `.nextInt()`, `.nextDouble()` for numeric input.

---

### 2️⃣ Reading Words

```java
System.out.print("Name: ");
String name = scanner.next();
System.out.println("You are " + name);
```

* `.next()` → reads **one word** only (stops at space).

---

### 3️⃣ Reading Full Lines

```java
System.out.print("Full Name: ");
String name = scanner.nextLine();
System.out.println("You are " + name);
```

* `.nextLine()` → reads **whole line**, including spaces.

* Remove extra spaces with `.trim()`:

```java
String name = scanner.nextLine().trim();
```

---

✅ Key Tips:

* Always create **one Scanner object** per program: `Scanner scanner = new Scanner(System.in);`

* Use `.next()` for a single word, `.nextLine()` for a full line.

* `.trim()` removes unwanted spaces at start/end.