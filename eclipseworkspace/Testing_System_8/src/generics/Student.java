package generics;

public class Student<T extends Number> {
	private T id;
	private String name;
	
	
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
	}

	public Student(T id, String name) {
		this.id = id;
		this.name = name;
	}
	public <T> void print(T a, T b){
		System.out.println(a);
		System.out.println(b);
	}
}
