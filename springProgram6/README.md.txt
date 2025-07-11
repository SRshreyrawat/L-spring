 Spring Setter-Based Dependency Injection using Java Configuration

This project demonstrates how to use **Spring Framework's Java-based configuration** to implement **Setter-based Dependency Injection (DI)** in a simple Java application.

## 📁 Project Structure

in.sp.beans
├── Student.java
├── Address.java

in.sp.resources
└── SpringConfigFile.java # Java-based Spring configuration using @Configuration and @Bean

in.sp.main
└── Main.java # Entry point of the application


---

## ✅ Technologies Used

- Java 8+
- Spring Framework (Core Container)
- No XML Configuration (JavaConfig only)

---

## 🧠 Concepts Demonstrated

- `@Configuration` and `@Bean` annotations
- Manual Java-based bean creation
- Setter-based dependency injection
- Spring container using `AnnotationConfigApplicationContext`

---

## 💡 How it Works

1. **Student** and **Address** are two simple Java classes (POJOs).
2. Dependencies are injected manually via setter methods.
3. A Spring configuration class (`SpringConfigFile`) is annotated with `@Configuration` and declares beans using `@Bean`.
4. The `Main` class loads the context using `AnnotationConfigApplicationContext` and retrieves the `Student` bean.
5. The `display()` method prints the injected details.

---

## 🧪 Sample Output

Alok
50
100-Delhi123456



## 🚀 Running the Application

1. Open the project in Eclipse or any Java IDE.
2. Make sure Spring Core is added to your classpath.
3. Run the `Main.java` file.

---

## 📌 Notes

- This example uses **setter injection**. You can switch to **constructor injection** or **@Autowired** if needed.
- This is a minimal Spring project meant for learning core concepts without Spring Boot.

---

