package lesson8;

public class Student implements Comparable<Student>{
	private String name;
	private int mark;
	private int age;
	
	public Student(String name, int mark, int age) {
		this.name = name;
		this.mark = mark;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public int compareTo(Student s) {
		if(this.age > s.getAge()) return 5;
		else if(this.age < s.getAge()) return -5;
		else return 0;
	}
	@Override
	public String toString() {
		return "Name : " + name + "             Mark : " + mark + "                  Age : " + age;
	}
	
	
}
