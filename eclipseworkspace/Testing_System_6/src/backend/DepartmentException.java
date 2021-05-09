package backend;

import java.util.Scanner;

public class DepartmentException {
	private String name;
	private int id;
//	private Scanner sr;
	public DepartmentException(){
//		sr = new Scanner(System.in);
		id = ScannerUtils.inputInt("It is not a integer number !");
		name = ScannerUtils.inputString();
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		return "Department ID : " + id + "\nDepartment Name : " + name;
	}
}
