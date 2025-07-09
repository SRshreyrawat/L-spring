
# Spring Program 3 – Annotation + Java-Based Configuration

This project demonstrates how to use **annotation-based configuration** combined with **Java-based configuration class** in a Spring application — no XML involved.

---

### 🧠 What You'll Learn

- Using `@Component` to declare a class as a Spring bean
- Using `@Value` to inject hardcoded values into fields
- Enabling component scanning using `@ComponentScan` in Java config
- Loading the Spring context with `AnnotationConfigApplicationContext`

---

### 📁 Project Structure

springProgram3/
├── src/
│ └── in/sp/
│ ├── beans/
│ │ └── Student.java
│ ├── main/
│ │ └── Main.java
│ └── resources/
│ └── SpringConfigFile.java



---

### 🔧 Technologies Used

- Java
- Spring Core
- Annotations: `@Component`, `@Value`, `@Configuration`, `@ComponentScan`

---

### 🔍 Key Components Explained

#### ✅ 1. `Student.java` Bean

```java
@Component
public class Student {
    @Value("Deepak")
    private String name;

    @Value("1004")
    private int rollNo;

    @Value("deepak@gmail.com")
    private String email;

    public void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(email);
    }
}
@Component registers the class as a Spring bean

@Value injects literal values into fields

✅ 2. Java Configuration Class
java-code:-

@Configuration
@ComponentScan("in.sp.beans")
public class SpringConfigFile { }
@Configuration makes this a Spring config class

@ComponentScan tells Spring to scan the in.sp.beans package for components

✅ 3. Main Application
java-code:-

ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
Student std = (Student) context.getBean("student");
std.display();
Loads the Spring context using Java config

Retrieves the auto-scanned bean student by name

✅ Output

Deepak
1004
deepak@gmail.com


📌 Concepts Covered
Annotation			Purpose
@Component		Declares a class as a Spring-managed bean
@Value	Injects 	values into fields
@Configuration		Marks class as Spring config
@ComponentScan		Tells Spring which packages to scan

✅ Author
Shrey Rawat
GitHub Profile

---

## 🟢 What To Do Next

1. Create `README.md` inside `springProgram3/`
2. Paste the above content
3. Save and close
4. Push it to GitHub:

```bash
git add springProgram3/README.md
git commit -m "Added README.md for springProgram3 (annotations + Java config)"
git push
