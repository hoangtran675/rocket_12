package Lesson4;


public class Person {
	String name;
    int age;
	// ham khoi tao khong tham so
    Person(){
    	
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// ham khoi tao co tham so
    Person(String name){
    	this.name = name;
    }
    public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
//	Person(String name, int age){
//    	this.name = name;
//    	this.age = age;
//    }
 // convert infor of object to String type
	public String toString(){
		return name + "-" + age;
	}
}
