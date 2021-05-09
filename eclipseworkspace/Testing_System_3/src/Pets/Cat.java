package Pets;

public class Cat {
	int age; // dang default : cung chung package thi sd duoc : SAME PACKAGE
	private String color; // chi sd cho chinh class do        : SAME CLASS
	public int length;
	protected int weight;  // sd trong cung package           : SAME PACKAGE + INHERITANCE

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		if(color.equals("White") || color.equals("Yellow") || color.endsWith("Black") ){
			this.color = color;
		}
		
	}
}
