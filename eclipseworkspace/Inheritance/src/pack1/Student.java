package pack1;

public class Student extends Person {
	int clazz;
	Student(String name, int age, int clazz){
		super(name, age);
		this.clazz = clazz;
	}
}
