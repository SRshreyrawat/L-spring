/* 
 	Topic :- Xml Based Configuration
 */


package in.sp.beans;


public class Student {
	private String name;
	private int rollNo;
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
