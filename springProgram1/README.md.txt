
# Spring Program 1 – XML-Based Bean Configuration

This project demonstrates how to configure and use Spring beans using **XML-based configuration** in a simple Java application.

### 🧠 What You'll Learn
- How to define beans using XML (`<bean>` tag)
- How to inject properties using `<property>` tag
- How to load Spring context using `ClassPathXmlApplicationContext`
- Basics of Dependency Injection without annotations

---

### 📁 Project Structure

springProgram1/
├── src/
│ └── in/sp/
│ ├── beans/
│ │ └── Student.java
│ └── main/
│ └── Main.java
├── resources/
│ └── applicationContext.xml


---

### 🔧 Technologies Used
- Java
- Spring Framework (Core)
- XML-based Configuration

---

### 🔍 How It Works

1. **Bean Configuration (`applicationContext.xml`)**
```xml
<bean class="in.sp.beans.Student" id="stId">
    <property name="name" value="Deepak"/>
    <property name="rollNo" value="101"/>
    <property name="email" value="deepak@gmail.com"/>
</bean>
Student.java
A simple POJO class with fields: name, rollNo, and email, along with getters/setters and a display() method to print them.

Main.java
Loads the Spring context and retrieves the Student bean:

java code:-
	ApplicationContext context = new 	ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
	Student std = (Student) context.getBean("stId");
	std.display();


▶️ How to Run
Open in Eclipse

Right-click Main.java → Run as → Java Application

Output:
Deepak
101
deepak@gmail.com



📌 Concepts Covered
XML-based Spring Configuration

Bean definition and injection

ClassPathXmlApplicationContext usage

✅ Author
Shrey Rawat
GitHub Profile

---

## 📥 Next Steps:
1. Create a file `README.md` inside your `springProgram1` folder
2. Paste the content above
3. Save and close
4. In Git Bash, run:

```bash
git add springProgram1/README.md
git commit -m "Added detailed README.md to springProgram1"
git push