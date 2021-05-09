package collections;

import java.util.List;

import javax.crypto.SealedObject;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {
	public static List<Student> s = new ArrayList<Student>();

	public static void main(String[] args) {

		s.add(new Student("Hoang"));
		s.add(new Student("Hoang"));
		s.add(new Student("Hieu"));
		s.add(new Student("Yen"));
		s.add(new Student("Hoang"));
		s.add(new Student("Loan"));
		for (Student student : s) {
			System.out.println(student.toString());
		}
		System.out.println("Before--------------");
		reverseList();
		// a ) so phan tu cua list
		System.out.println("The number of element in the list : " + s.size());
		// b ) phan tu thu 4
		System.out.println("The forth element of the list : " + s.get(3).toString());
		// c) phan tu thu 1
		System.out.println("The first element of the list : " + s.get(0).toString());
		// d) phan tu cuoi cung
		System.out.println("The last element of the list : " + s.get((int) s.size() - 1).toString());
		// e) them phan tu vao dau cua mang
		System.out.println("----------------------------------------------");
		s.add(0, new Student("Duy"));
		for (Student student : s) {
			System.out.println(student.toString());
		}
		// f ) them phan tu vao cuoi hang
		s.add(new Student("Ngoc"));
		
		searchByID(10);
		// i ) xoa ten co id = 2
		deleteNameByID(2);
		searchByName("Ngoc");
		// k )  xoa sinh vien co id = 5
		s.remove(5);
		System.out.println("--------------------------------Copy");
		ArrayList<Student> studentCopies = new ArrayList<Student>(s);
		for (Student student : studentCopies) {
			System.out.println(student.toString());
		}
//		System.out.println("--------------------------------------Same name in the list");
//		s.add(new Student("Loan"));
//		s.add(new Student("Hoang"));
//		s.add(new Student("Hoang"));
//		s.add(new Student("Yen"));
//		s.add(new Student("Yen"));
//		s.add(new Student("Loan"));
//
//		sameName();

	}
	// doi nguoc vi tri trong mang
	public static void reverseList(){
		List<Student> sReverse = new ArrayList<Student>();
		for(int i = s.size() - 1 ; i >= 0; i--){
			sReverse.add(s.get(i));
		}
		for (Student student : sReverse) {
			System.out.println(student.toString());
		}
	
	}
	// g ) Search By ID
	public static void searchByID(int id) {
		boolean check = false;
		System.out.println("You search by id : " + id);
		for (Student student : s) {
			if (student.getId() == id) {
				check = true;
				System.out.println(student.toString());
			}
		}
		if (check == false) {
			System.out.println("Dont have student by this ID");
		}
	}

	// h ) Search By Name
	public static void searchByName(String name) {
		boolean check = false;
		System.out.println("You search by name : " + name);
		for (Student student : s) {
			if (name.equals(student.getName())) {
				check = true;
				System.out.println(student.toString());
			}
		}
		if (check == false) {
			System.out.println("Dont have student by this name");
		}
	}

	// i ) cac student trung ten
	public static void sameName() {
		List<Student> sCopy = new ArrayList<Student>();
		List<Student> sResult = new ArrayList<Student>();
		sCopy = s;
		boolean check = false;
		for (int i = 0; i < sCopy.size(); i++) {
			for (int j = i + 1; j < sCopy.size(); j++) {
				if (sCopy.get(i).getName().equals(sCopy.get(j).getName())) {
					check = true;
					sResult.add(sCopy.get(j));
					sCopy.remove(j);
					j--;
				}
			}
			if (check == true) {
				sResult.add(sCopy.get(i));
				sCopy.remove(i);
				check = false;
				i--;
			}
			Collections.sort(sResult, new CompatatorID());
			for (Student student : sResult) {
				System.out.println(student.toString());
			}
			sResult.clear();
		}
	}
	// j ) xoa theo id
	public static void deleteNameByID(int i){
		for (Student student : s) {
			if(student.getId() == i){
				student.setName("");
			}
		}
	}
	

}
