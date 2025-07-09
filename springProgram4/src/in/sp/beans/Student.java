/* 
 	Topic :- Annotation Based Configuration + Xml-Based configuration
 */
package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Ansh")
    private String name;

    @Value("1005")
    private int rollNo;

    @Value("ansh@gmail.com")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(email);
    }
}


// Important Notes

/* 
  ==> The "@Component" annotation in Spring is used to declare a 
       class as a Spring bean, which is a managed component in 
       the Spring application context.
  
  ==> It helps Spring automatically detect and manage these beans 
       during application startup, making them available for 
       dependency injection and other Spring features.
   
  ==> @Component annotation is also known as a "Stereotype annotation".
  
  ==> Some commonly used annotations that are based on @Component are:
         1] @Service
         2] @Repository
         3] @Controller
   
  ==> The @Value annotation in Spring is used to inject values 
       into Spring bean fields or methods.
   
  ==> @Value is mostly used to inject values from external sources 
       (e.g., properties files or environment variables).
 */
