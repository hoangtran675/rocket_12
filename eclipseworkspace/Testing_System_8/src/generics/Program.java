package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		// print("student");
		// print(4);
		// print(4.0);
		// Integer[] intArr = {10,20,30,40};
		// Long[] longArr = {100l, 200l, 300l, 400l};
		// Float[] floatArr = {10.0f, 20.0f, 30.0f, 40.0f};
		// Double[] doubleArr= {10.01d, 20.01d, 30.01d, 40.01d};
		// printArr(intArr);
		// question5();

	}

	// Question 1
	public static void question1() {
		Student<Integer> s1 = new Student<Integer>(1, "Hoang");
		Student<Float> s2 = new Student<Float>(2f, "Hoang");
		Student<Double> s3 = new Student<Double>(3d, "Hoang");
	}

	// Question 2
	public static <T> void print(T var) {
		System.out.println(var);
	}

	// Question 4
	static <T> void printArr(T[] varArr) {
		for (T element : varArr) {
			System.out.println(element);
		}
	}

	// Question 5
	public static void question5() {
		Integer[] intArr = { 1, 2, 3, 4, 5 };
		Float[] floatArr = { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f };
		Double[] doubleArr = { 1.2234d, 2.3456d, 3.4567d, 4.5678d, 5.6789d };
		Employee emp1 = new Employee(1, "Hoang", intArr);
		Employee emp2 = new Employee(2, "Nam", floatArr);
		Employee emp3 = new Employee(3, "Toan", doubleArr);
		System.out.println(
				"Salary at the last month of Employee 1 : " + emp1.getSalaries()[emp1.getSalaries().length - 1]);
		System.out.println(
				"Salary at the last month of Employee 2 : " + emp2.getSalaries()[emp2.getSalaries().length - 1]);
		System.out.println(
				"Salary at the last month of Employee 3 : " + emp3.getSalaries()[emp3.getSalaries().length - 1]);
	}

	// Question 6
	public static void question6() {
		MyMap<Integer, String> s1 = new MyMap<Integer, String>(1, "Hoang");
		MyMap<Integer, String> s2 = new MyMap<Integer, String>(2, "Hoan");
	}
	// Question 7
	public static void question7(){
		Phone<String, String> phone1 = new Phone<String, String>("tran16875@gmail.com", "0321456789");
		Phone<Integer, String> phone2 = new Phone<Integer, String>(1, "0987654231");
		Phone<String, String> phone3 = new Phone<String, String>("Hoang", "0326578941");
	}
	// Question 8
	public static void question8(){
		Staff<Integer, String> staff1 = new Staff<Integer, String>(1, "Hoang");
		Staff<Long, String> staff2 = new Staff<Long, String>(1000l, "Yen");
	}

}
