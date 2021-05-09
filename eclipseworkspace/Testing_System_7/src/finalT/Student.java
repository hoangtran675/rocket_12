package finalT;

public class Student {
	
	public final int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student ID : " +  id + "\tStudent Name : " + name;
	}
	public final void study(){
		System.out.println("Studying...");
		
	}
	
	
}
