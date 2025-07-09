# Spring Program 2 – Java-Based Configuration

This project demonstrates how to configure Spring beans **without using XML**, by leveraging **Java-based configuration using annotations**.

---

### 🧠 What You'll Learn

- Using `@Configuration` and `@Bean` annotations to define beans
- Replacing `applicationContext.xml` with a Java class (`SpringConfigFile`)
- Registering multiple beans with custom names
- Loading context with `AnnotationConfigApplicationContext`

---

### 📁 Project Structure

springProgram2/
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
- Spring Core (no XML)
- Java-based Bean Configuration
- Annotations: `@Configuration`, `@Bean`

---

### 🔍 How It Works

#### 🔹 Step 1: Configuration Class
```java
@Configuration
public class SpringConfigFile {

    @Bean("Std1Obj1")
    public Student createStdBeansObj1() {
        Student std = new Student();
        std.setName("Kamal");
        std.setRollNo(103);
        std.setEmail("kamal123@gmail.com");
        return std;
    }

    @Bean("Std1Obj2")
    public Student createStdBeansObj2() {
        Student std = new Student();
        std.setName("yoo");
        std.setRollNo(100);
        std.setEmail("Yoo123@gmail.com");
        return std;
    }
}
🔹 Step 2: Main Class
java-code
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
Student std1 = context.getBean("Std1Obj1", Student.class);
Student std2 = context.getBean("Std1Obj2", Student.class);
std1.display();
std2.display();
🔹 Output
Kamal
103
kamal123@gmail.com
yoo
100
Yoo123@gmail.com
✅ Key Concepts Covered
  Concept					Explanation
@Configuration				Marks the class as Spring config class
@Bean					Defines a bean method (returns an object to be 						managed by Spring)
AnnotationConfigApplicationContext	Loads config class instead of XML
					Multiple beans	You can register multiple beans of 					the same class with different names

✅ Author
Shrey Rawat
GitHub Profile



---

## 🟢 What to Do Now

1. Create a file: `springProgram2/README.md`
2. Paste the content above
3. Save and close the file
4. Open Git Bash in your `L-spring` folder and run:

```bash
git add springProgram2/README.md
git commit -m "Added README.md for springProgram2 (Java-based config)"
git push