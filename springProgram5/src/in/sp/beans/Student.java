package in.sp.beans;

public class Student {
	private String name;
	private int rollNo;
	private Address address;  // ✅ Correct type

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setAddress(Address address) {  // ✅ Update setter
		this.address = address;
	}

	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(address);  // ✅ Will call Address.toString()
	}
}
