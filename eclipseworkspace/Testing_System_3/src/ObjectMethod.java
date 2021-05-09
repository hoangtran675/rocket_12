import java.util.Arrays;
import java.util.Collections;

public class ObjectMethod {

	public static void main(String[] args) {
		question();
	}

	// Question 1
	public static void question1() {
		// over ride in account class
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		System.out.println(dept1.toString());
	}
	// Question 2
	public static void question2(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		Department dept2 = new Department();
		dept2.id = 2;
		dept2.name = "Marketing";
		Department dept3 = new Department();
		dept3.id = 3;
		dept3.name = "Secutity";
		Department dept4 = new Department();
		dept4.id = 4;
		dept4.name = "HR";
		Department[] departments = {dept1, dept2, dept3, dept4};
		for(Department department : departments){
			System.out.println(department.toString());
		}
		
	}
	// Question 3
	public static void question3(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		System.out.println(dept1.hashCode());
	}
	// Question 4
	public static void question4(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		Department dept2 = new Department();
		dept2.id = 2;
		dept2.name = "Marketing";
		Department dept3 = new Department();
		dept3.id = 3;
		dept3.name = "Secutity";
		Department dept4 = new Department();
		dept4.id = 4;
		dept4.name = "HR";
		if(dept1.name.equals("A")){
			System.out.println("Name of Departmetn 1 is A");
		}
		else{
			System.out.println("Name of Departmetn 1 is not A");
		}
	}
	// Question 5
	public static void question5(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		Department dept2 = new Department();
		dept2.id = 2;
		dept2.name = "Sale";
		Department dept3 = new Department();
		dept3.id = 3;
		dept3.name = "Secutity";
		Department dept4 = new Department();
		dept4.id = 4;
		dept4.name = "HR";
		if(dept1.name.equals(dept2.name)){
			System.out.println("Dept1 and Dept2 are same name");
		}else{
			System.out.println("Dept1 and Dept2 are not same name");
		}
	}
	// Question 6
	public static void question6(){
		// use Comparator
		Department dept1 = new Department("Marketing");
		Department dept2 = new Department("Boss of director");
		Department dept3 = new Department("Accounting");
		Department dept4 = new Department("Waiting room");
		Department dept5 = new Department("Sale");
		Department[] depts = {dept1, dept2, dept3, dept4, dept5};
		// su dung phuong thuc comparatorName tu dinh nghia de tra ve 0, so duong, so am
		// collections su dung bo so do de thay doi vi tri, sort
		Collections.sort(Arrays.asList(depts), new ComparatorName());
		for(Department dept : depts){
			System.out.println(dept.toString());
		}
	}
	// Question 6 : compare ID
	public static void question6V1(){
		// use Comparator
		Department dept1 = new Department(2);
		Department dept2 = new Department(1);
		Department dept3 = new Department(4);
		Department dept4 = new Department(5);
		Department dept5 = new Department(3);
		Department[] depts = {dept1, dept2, dept3, dept4, dept5};
		Collections.sort(Arrays.asList(depts), new CompatatorID());
		for(Department dept : depts){
			System.out.println(dept.toString());
		}
		
	}
	// Question 6 : comparable default
	public static void question6V2(){
		Department dept1 = new Department(2);
		Department dept2 = new Department(1);
		Department dept3 = new Department(4);
		Department dept4 = new Department(5);
		Department dept5 = new Department(3);
		Department[] depts = {dept1, dept2, dept3, dept4, dept5};
		Collections.sort(Arrays.asList(depts));
		for(Department dept : depts){
			System.out.println(dept.toString());
		}
	}
	// Question 7 : 
	public static void question7(){
		Student student1 = new Student("Tran Van Hoang");
		Student student2 = new Student("Pham Van An");
		Student student3 = new Student("le hong thai");
		Student student4 = new Student("Dinh Thi Le");
		Student student5 = new Student("nguyen van dai");
		Student student6 = new Student("Duong Van Long");
		Student student7 = new Student("Ngoc");
		Student[] students = {student1, student2, student3, student4, student5, student6, student7};
		Collections.sort(Arrays.asList(students), new ComparatorStudent());
		for(Student student : students){
			System.out.println(student.toString());
		}
	}
	
	// question
	public static void question(){
		Department dept1 = new Department(2, "D");
		Department dept2 = new Department(1, "Y");
		Department dept3 = new Department(1, "D");
		Department dept4 = new Department(5, "Y");
		Department dept5 = new Department(5, "E");
		Department dept6 = new Department(6, "A");
		Department dept7 = new Department(6, "B");
		Department dept8 = new Department(6, "C");
		
		Department[] depts = {dept1, dept2, dept3, dept4, dept5, dept6, dept7, dept8};
		Collections.sort(Arrays.asList(depts), new CompatatorID());
		Collections.sort(Arrays.asList(depts), new ComparatorName());
		for(Department dept : depts){
			System.out.println(dept.toString());
		}
	}
	

}
