Dependency Injection with Java Config and Constructor Injection (Spring)
This project demonstrates Constructor-Based Dependency Injection using Java-based configuration (@Configuration, @Bean) in the Spring Framework.

🧩 Technologies Used
Java

Spring Core (Java Config - @Configuration)

Eclipse/IntelliJ (Optional)

📁 Project Structure

in.sp.main         → Main class to run the application  
in.sp.beans        → POJOs: Student and Address  
in.sp.resources    → Spring configuration using @Configuration and @Bean  
🚀 How It Works
Spring container is created using AnnotationConfigApplicationContext.

Dependencies (Address) are injected into Student via constructor.

The config file (SpringConfigFile) manually defines beans using @Bean methods.

▶️ Running the App

Run Main.java
It prints the student's name, roll number, and address via Spring-managed beans.

📚 Learning Focus
Spring Java-based Configuration

Constructor Injection

Manual bean wiring using @Bean
