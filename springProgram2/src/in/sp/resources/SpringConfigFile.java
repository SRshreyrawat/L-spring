package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Student;

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
