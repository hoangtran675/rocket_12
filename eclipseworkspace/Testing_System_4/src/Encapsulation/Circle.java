package Encapsulation;

public class Circle {
	private double radius ;
	private String color ;
	
	public Circle(){
		
	}
	public Circle(double radius){
		
	}
	public Circle(double radius, String color){
		
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public String toString(){
		return "Ban kinh : " + radius + "       Mau sac : " + color + "      Dien tich : "+ getArea();
	}
}
