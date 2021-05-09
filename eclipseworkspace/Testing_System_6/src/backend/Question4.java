package backend;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
	public static List<Department> dept = new ArrayList<Department>();
	public static void main(String[] args) {
		Department dept1 = new Department(1, "Sale");
		Department dept2 = new Department(2, "Marketing");
		Department dept3 = new Department(3, "PM");
		dept.add(dept1);
		dept.add(dept2);
		dept.add(dept3);
		getIndex(3);
	}
	public static void getIndex(int i){
		try{
			System.out.println("Department ID : "+ dept.get(i).getId() +
					"Department Name : " + dept.get(i).getName());
		}catch(IndexOutOfBoundsException e){
			System.out.println("Cannot find department");
		}
		
	}

}
