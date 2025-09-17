
---

# How Java Code Gets Executed

---

- Compilation
- Execution

> **Source Code (*.java) -> Java Compiler -> Byte Code (*.class)**

```bash
HelloWorld\src\com\asaslabs> javac Main.java
```

> Will create the 'Main.class' bytecode representation of the Java File

```bash
HelloWorld\src> java com.asaslabs.Main
```

> Load the bytecode and convert it to native code for the operating system

- Java Editions

1.  Standard Edition (SE)
2. Enterprise Edition (EE)
3. Micro Edition (ME)
4. Java Card