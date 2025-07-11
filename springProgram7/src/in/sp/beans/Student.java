package in.sp.beans;

public class Student {
		private String name;
		private int rollNo;
		private Address address;
		public Student(String name,int rollNo,Address address) {
			this.address=address;
			this.name=name;
			this.rollNo=rollNo;
		}
		public void display() {
			// TODO Auto-generated method stub
			System.out.println(name);
			System.out.println(rollNo);
			System.out.println(address);
		}
}
