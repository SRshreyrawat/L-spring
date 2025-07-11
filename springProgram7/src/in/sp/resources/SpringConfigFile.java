package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Address;
import in.sp.beans.Student;
@Configuration
public class SpringConfigFile {
		 
	
	@Bean 
	public Address createAddrObj() 
	{
Address addr = new Address(186,"Delhi",9651753);
return addr;
		
	}
	@Bean
	public Student createStdObj() {
Student std = new Student("Shlok",58,createAddrObj());
return std;
	}
}
