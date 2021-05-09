package Inheritance;

public class HighSchoolStudent extends Student{
	String clazz;
	String desiredUniversity;
	HighSchoolStudent(String name, int id, String clazz, String desiredUniversity){
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
//	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
//		super(name, id);
//		this.clazz = clazz;
//		this.desiredUniversity = desiredUniversity;
//	}
	
}
