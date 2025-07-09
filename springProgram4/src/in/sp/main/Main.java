package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main
{
    public static void main(String[] args)
    {
        String resource_file_path = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);

        Student std = (Student) context.getBean("student");
        std.display();
    }
}


//===========================
//		Important Notes     
//===========================

/* 
1] ApplicationContext:
    -------------------
* The Spring container that loads bean definitions and manages their 
lifecycle and dependencies.

2] ClassPathXmlApplicationContext:
    -------------------------------
* A specific implementation of ApplicationContext that loads configuration 
from an XML file located in the classpath.

3] <context:component-scan>:
    --------------------------
* Tells Spring which package to scan for annotated classes like 
@Component, @Service, @Repository, or @Controller.
* Spring automatically registers those classes as beans.
*/
