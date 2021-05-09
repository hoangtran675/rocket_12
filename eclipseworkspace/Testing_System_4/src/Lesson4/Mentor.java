package Lesson4;

public class Mentor extends Person{
	private int numOfClasses;
	public Mentor(String name, int age, int numOfClasses){
		// super = Person : dung de khoi tao thuoc tinh va phuong thuc cua class cha
		super(name, age);  // day la ham khoi tao 2 tham so cua lop cha, co the co ham khoi tao khong tham so khac
		this.numOfClasses = numOfClasses;
	}
	public String toString(){
		return super.toString() + "-" + numOfClasses;  // doi voi method cua lop cha thi ta dung super.
	}
	public Mentor(String name, int numOfClasses){
		// super = Person : dung de khoi tao thuoc tinh va phuong thuc cua class cha
		super(name);  // day la ham khoi tao 2 tham so cua lop cha, co the co ham khoi tao khong tham so khac
		this.numOfClasses = numOfClasses;
	}
}
