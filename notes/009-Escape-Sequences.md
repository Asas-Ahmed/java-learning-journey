
---

# Escape Sequences

---

```java
String message = "Hello \"Hasashi\"";
System.out.println(message);
```
```
Hello "Hasashi"
```

```java
String message = "c:\\Windows\\...";
System.out.println(message);
```
```
c:\Windows\...
```

```java
String message = "c:\nWindows\\...";
System.out.println(message);
```
```
c:
Windows\...
```

```java
String message = "c:\tWindows\\...";
System.out.println(message);
```
```
c:	Windows\...
```