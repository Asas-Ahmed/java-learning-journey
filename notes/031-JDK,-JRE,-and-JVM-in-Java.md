
---

# JDK, JRE, and JVM in Java

These three components are essential for writing, compiling, and running Java programs. They form a nested structure: **JDK $\supset$ JRE $\supset$ JVM**. 

***

### 1. JVM (Java Virtual Machine) 🤖

The **JVM** is the **execution engine**. It's the core component that actually *runs* your Java code.

* **What it is:** An abstract machine specification. It's the **runtime environment** that executes Java bytecode.
* **Key Function:** It makes Java **"Write Once, Run Anywhere" (WORA)**. The JVM translates the platform-independent bytecode into platform-specific machine code.
* **Presence:** It's included in both the JRE and the JDK.

***

### 2. JRE (Java Runtime Environment) 🏃

The **JRE** is needed to **run** a compiled Java program. If you only want to use (not develop) Java applications, you only need the JRE.

* **What it is:** A set of software tools that bundles the **JVM** and the **Java Class Libraries** (core libraries/APIs).
* **Key Function:** Provides the minimum requirements for executing a Java application.
* **Contains:** **JVM + Libraries (Standard APIs)**.

***

### 3. JDK (Java Development Kit) 🛠️

The **JDK** is needed to **develop** (write, compile, and debug) Java programs. It's the complete package for Java developers.

* **What it is:** A software development environment used for building applications and applets in Java.
* **Key Function:** Provides all the tools necessary for development.
* **Contains:** **JRE + Development Tools** (like the **compiler `javac`**, debugger, archiver, etc.).

| Component | Purpose | Use Case | Contains |
| :--- | :--- | :--- | :--- |
| **JDK** | **Development** | Writing/Compiling Code | JRE + Tools |
| **JRE** | **Runtime** | Running Compiled Code | JVM + Libraries |
| **JVM** | **Execution** | Executing Bytecode | N/A (Specification) |