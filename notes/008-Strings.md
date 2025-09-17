
---

# Strings

---

```java
String message = "Hello World";
System.out.println(message);
```
```
Hello World
```

```java
String message = "Hello World" + "!!";

System.out.println(message.endsWith("!!"));
```
```
true 
```

```java
String message = "Hello World" + "!!";

System.out.println(message.startsWith("!!"));
```
```
false
```

```java
String message = "Hello World" + "!!";

System.out.println(message.length());
```
```
13
```

```java
String message = "Hello World" + "!!";

System.out.println(message.indexOf("e"));
```
```
1
```

```java
String message = "Hello World" + "!!";

System.out.println(message.replace("!", "*"));
System.out.println(message);
System.out.println(message.toLowerCase());
```
```
Hello World**
Hello World!!
hello world!!
```

```java
String message = "  Hello World" + "!!   ";

System.out.println(message.trim());
System.out.println(message);
```
```
Hello World!!
  Hello World!!  
```