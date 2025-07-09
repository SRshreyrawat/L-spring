
# Spring Program 4 – Annotations + XML Configuration

This project demonstrates how to use **annotation-based Spring beans** (`@Component`, `@Value`) while still configuring Spring context using an **XML configuration file**.

---

### 🧠 What You'll Learn

- How to declare beans using annotations like `@Component`
- How to inject values using `@Value`
- How to use `<context:component-scan>` in XML to enable annotation scanning
- Mixing annotations and XML to configure a Spring application

---

### 📁 Project Structure

springProgram4/
├── src/
│ └── in/sp/
│ ├── beans/
│ │ └── Student.java
│ ├── main/
│ │ └── Main.java
│ └── resources/
│ └── applicationContext.xml



---

### 🔧 Technologies Used

- Java
- Spring Core
- Annotations: `@Component`, `@Value`
- XML Configuration (`applicationContext.xml`)

---

### 🔍 Key Concepts

#### ✅ 1. Annotated Bean: `Student.java`

```java
@Component
public class Student {
    @Value("Ansh")
    private String name;

    @Value("1005")
    private int rollNo;

    @Value("ansh@gmail.com")
    private String email;

    public void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(email);
    }
}
@Component: Tells Spring to create and manage this bean

@Value: Injects literal values into the fields

✅ 2. XML Config: applicationContext.xml

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
         http://www.springframework.org/schema/beans 
         http://www.springframework.org/schema/beans/spring-beans.xsd
         http://www.springframework.org/schema/context 
         http://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="in.sp.beans" />
</beans>
context:component-scan: Tells Spring to scan in.sp.beans for annotated classes like @Component

✅ 3. Main App: Main.java
java-code
ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
Student std = (Student) context.getBean("student");
std.display();
Loads context from the XML file

Fetches the auto-registered bean named "student"

✅ Output

Ansh
1005
ansh@gmail.com
📌 Concepts Covered
  Concept					Explanation
@Component			Marks a class as a Spring-managed bean
@Value				Injects hardcoded or external values into fields
<context:component-scan>	Enables scanning for annotated components
ClassPathXmlApplicationContext	Loads Spring context from XML

✅ Author
Shrey Rawat
GitHub Profile



---

## 📥 What to Do Now

1. Create the file: `springProgram4/README.md`
2. Paste the content above
3. Save and close
4. Then in Git Bash:

```bash
git add springProgram4/README.md
git commit -m "Added README.md for springProgram4 (Annotations + XML config)"
git push