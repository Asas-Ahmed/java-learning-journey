
---

# Java Strings

-----

Strings are sequences of characters. They are **immutable**, meaning methods like `replace()` and `trim()` return a **new** string, leaving the original unchanged.

-----

### 1\. Basic Output

```java
String message = "Hello World";
System.out.println(message);
```

```
Hello World
```

-----

### 2\. Properties and Checks

**Length** (Total characters):

```java
String message = "Hello World" + "!!";
System.out.println(message.length());
```

```
13
```

**Index** (Position of first match; starts at 0):

```java
String message = "Hello World" + "!!";
System.out.println(message.indexOf("e"));
```

```
1
```

**Starts With**:

```java
String message = "Hello World" + "!!";
System.out.println(message.startsWith("!!"));
```

```
false
```

**Ends With**:

```java
String message = "Hello World" + "!!";
System.out.println(message.endsWith("!!"));
```

```
true
```

-----

### 3\. Transformation Methods (Return New String)

**Replace** (Replaces all occurrences):

```java
String message = "Hello World" + "!!";
System.out.println(message.replace("!", "*"));
System.out.println(message); // Original is unchanged
```

```
Hello World**
Hello World!!
```

**Lowercase**:

```java
String message = "Hello World" + "!!";
System.out.println(message.toLowerCase());
```

```
hello world!!
```

**Trim** (Removes leading/trailing whitespace):

```java
String message = "  Hello World" + "!!   ";
System.out.println(message.trim());
System.out.println(message); // Original is unchanged
```

```
Hello World!!
  Hello World!!   
```