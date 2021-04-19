
public class Student {
	String name;
	int age;
	public Student(String name) {
		
		this.name = name;
	}
	// lay ra ten cuoi trong name,format ve dang upperCase de tien so sanh
	public String tenCuoi(){
		String[] s1 =  name.split(" ");
		return s1[s1.length - 1].toUpperCase();
		
	}
	public String toString(){
		return "name : " + name + "---age " + age;
	}
	

}
