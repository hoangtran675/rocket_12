package entity;

public class StudentCollection {
	private static int count = 1;
	private int id;
	private String name;
	
	StudentCollection(){
		
	}
	public StudentCollection(String name){
		this.id = count;
		this.name = name;
		count++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "ID : " + id + "\t\t\t\t\tName : " + name;
	}
	

}
