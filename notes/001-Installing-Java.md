
---

# 🚀 Step-by-step Java Setup Guide

---

## 1️⃣ Install the JDK (Java Development Kit)

The JDK is what lets you compile and run Java.

1. Go to [Oracle JDK downloads](https://www.oracle.com/java/technologies/downloads/).
    - Download **Java SE Development Kit 21 (LTS)** (Windows x64 Installer).
2. Run the installer → follow prompts → default path is fine (`C:\Program Files\Java\jdk-21`).
3. Add to PATH:
    - Search for **Environment Variables** → Edit `PATH` → Add:
        
        ```
        C:\Program Files\Java\jdk-21\bin
        
        ```
        
4. Verify installation:
    
    ```bash
    java -version
    javac -version
    
    ```
    
    → should show `21.x`.
    

✅ Done! Now you have Java.

---

## 2️⃣ Install IntelliJ IDEA (main IDE)

1. Go to [IntelliJ IDEA download](https://www.jetbrains.com/idea/download/).
    - Download **Community Edition** (free).
2. Install with default options.
3. First launch → select **"Download JetBrains Runtime (JDK)"** if it asks.
4. You’re ready to create a **“Hello World” Java project**.

👉 If you later want **Spring Boot, advanced web, DB tools**, you can upgrade to **Ultimate Edition** (paid).

---

## 3️⃣ Install Build Tools (Maven & Gradle)

These manage dependencies and builds. IntelliJ already supports them, but you should also install standalone versions.

### Maven

1. Download from: [Maven Downloads](https://maven.apache.org/download.cgi).
2. Extract to `C:\apache-maven\`
3. Add to PATH:
    
    ```
    C:\apache-maven\bin
    
    ```
    
4. Verify:
    
    ```bash
    mvn -v
    
    ```
    

### Gradle

1. Download from: [Gradle Releases](https://gradle.org/releases/).
2. Extract to `C:\gradle\`
3. Add to PATH:
    
    ```
    C:\gradle\bin
    
    ```
    
4. Verify:
    
    ```bash
    gradle -v
    
    ```
    

✅ Now IntelliJ will automatically detect Maven/Gradle projects.

---

## 4️⃣ Install VS Code (backup editor)

1. Go to [VS Code download](https://code.visualstudio.com/).
2. Install, then add extensions:
    - **Extension Pack for Java** (by Microsoft) → gives debugging, Maven/Gradle integration, JUnit support.
    - **Spring Boot Tools** (if you plan Spring).

👉 Use VS Code for quick testing, IntelliJ for bigger projects.

---

## 5️⃣ Learn Spring Boot (Industry Framework)

Spring Boot is the most in-demand Java framework.

1. Go to [Spring Initializr](https://start.spring.io/).
2. Generate a starter project (Java 21, Maven or Gradle).
3. Import into IntelliJ.
4. Run → you’ll see a running web service.

---

## 6️⃣ Install Git (Version Control)

1. Download from [Git for Windows](https://git-scm.com/download/win).
2. Install with default settings.
3. Verify:
    
    ```bash
    git --version
    
    ```
    

👉 Later, connect IntelliJ with **GitHub/GitLab**.

---

## 7️⃣ Optional but Useful

- **Docker** (for microservices & containers): [Docker Desktop](https://www.docker.com/products/docker-desktop/).
- **Postman** (to test APIs): [Postman](https://www.postman.com/).
- **Database**: Install MySQL or PostgreSQL for practice.

---

# 🎯 Suggested Learning Path

1. Java basics (syntax, OOP, collections, streams, exceptions).
2. Build small CLI projects.
3. Learn Maven + Gradle basics.
4. Start with **Spring Boot** (REST API, database connection).
5. Learn Git & GitHub (push your projects).
6. Deploy a Spring Boot app (Docker or cloud).

---