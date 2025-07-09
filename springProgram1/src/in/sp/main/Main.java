package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] agrs) {
		String configloc = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configloc);
		Student std = (Student) context.getBean("stId");
		std.display();
	}
}
