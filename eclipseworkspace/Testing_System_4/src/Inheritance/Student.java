package Inheritance;

public abstract class Student extends Person{
	int id;

	public Student(String name, int id) {
		super(name);
		this.id = id;
	}

}
