package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std1 = context.getBean("Std1Obj1", Student.class);
        Student std2 = context.getBean("Std1Obj2", Student.class);
        std1.display();
        std2.display();
    }
}
