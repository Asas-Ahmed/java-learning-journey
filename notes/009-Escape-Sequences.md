
---

# 📝 Java Escape Sequences

---

**Escape Sequences** allow you to insert special characters—like quotation marks or new lines—into a string literal by preceding them with a **backslash** (`\`). This tells the compiler to treat the following character specially.

-----

### 1\. Common Sequences

| Code | Output | Description |
| :--- | :--- | :--- |
| `\"` | Double Quote | Allows you to include a double quote inside a string. |
| `\\` | Backslash | Inserts a literal backslash. (Needed because `\` is the escape character). |
| `\n` | Newline | Inserts a line break. |
| `\t` | Tab | Inserts a horizontal tab (spacing). |

-----

### 2\. Code Examples

**Double Quote (`\"`)**

```java
String message = "Hello \"Hasashi\"";
System.out.println(message);
```

```
Hello "Hasashi"
```

-----

**Backslash (`\\`)**

```java
String message = "c:\\Windows\\...";
System.out.println(message);
```

```
c:\Windows\...
```

-----

**Newline (`\n`)**

```java
String message = "c:\nWindows\\...";
System.out.println(message);
```

```
c:
Windows\...
```

-----

**Tab (`\t`)**

```java
String message = "c:\tWindows\\...";
System.out.println(message);
```

```
c: 	Windows\...
```