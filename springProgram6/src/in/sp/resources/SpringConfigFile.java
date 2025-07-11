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
		Address addr = new Address();
		addr.setHouseNo(100);
		addr.setCity("Delhi");
		addr.setPincode(123456);
		return addr;
		
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Alok");
		std.setRollNo(50);
		std.setAddress(createAddrObj());
		return std;
	}
}
