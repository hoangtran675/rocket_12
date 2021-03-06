package backend.staticT;

import java.util.ArrayList;
import java.util.List;

import backend.staticT.HinhChuNhat;
import backend.staticT.HinhHoc;
import backend.staticT.HinhHocException;
import backend.staticT.HinhTron;
import backend.staticT.Student;

public class QuestionDemo {

	// Question 1
	public static void question1() {
		Student a = new Student(1, "Nguyen Van A");
		Student b = new Student(2, "Nguyen Van B");
		Student c = new Student(3, "Nguyen Van C");
		List<Student> students = new ArrayList<Student>();
		students.add(a);
		students.add(b);
		students.add(c);
		for (Student student : students) {
			System.out.println(student.toString());
		}

		Student.setCollege("Dai Hoc Cong Nghe");
		System.out.println("-------------------------------After change-------------------------------");
		for (Student student : students) {
			System.out.println(student.toString());
		}

	}

	// Question 2
	public static void question2() {
		Student a = new Student(1, "Nguyen Van A");
		Student b = new Student(2, "Nguyen Van B");
		Student c = new Student(3, "Nguyen Van C");
		List<Student> students = new ArrayList<Student>();
		students.add(a);
		students.add(b);
		students.add(c);
		
		// Moi hs dong gop 100.000
		Student.groupMoney = 100000 * students.size();
		System.out.println("Moi hs dong gop 100000 : " + Student.groupMoney);
		// hoc sinh lay 50.000
		Student.groupMoney = Student.groupMoney - 50000;
		System.out.println("Sau khi hs thu 1 lay 50.000 : " + Student.groupMoney);
		// hoc sinh thu hai lay 20.000
		Student.groupMoney = Student.groupMoney - 20000;
		System.out.println("Sau khi hs thu 2 lay 20.000 : " + Student.groupMoney);
		// hoc sinh thu 3 lay 150.000
		Student.groupMoney = Student.groupMoney - 150000;
		System.out.println("Sau khi hc thu 3 lay 150.000 : " + Student.groupMoney);
		// Moi nguoi dong theo quy them 50.000
		Student.groupMoney = Student.groupMoney + 50000 * 3;
		System.out.println("Sau khi dong gop 50.000 : " + Student.groupMoney);
	}
	

	// question3 trong class MyMath
	// Question4 trong Student
	// Question5
	public static void question5(){
		Student a = new Student(1, "Nguyen Van A");
		System.out.println(a.toString());
		System.out.println("Count : " + a.getCount());
		Student b = new Student(2, "Nguyen Van B");
		System.out.println(b.toString());
		System.out.println("Count : " + b.getCount());
		Student c = new Student(3, "Nguyen Van C");
		System.out.println(c.toString());
		System.out.println("Count : " + c.getCount());
	}

	// Question 6
	public static void question6() throws Exception{
		List<Student> s = new ArrayList<Student>();
		s.add(new Student(1, "Hoang", 1));
		s.add(new Student(2, "nam", 2));
		s.add(new Student(3, "hieu", 2));
		s.add(new Student(4, "toan", 2));
		s.add(new Student(5, "Ngoc", 1));
		s.add(new Student(6, "thuy", 2));
		
		System.out.println("Tong so luong hoc sinh - sinh vien la : " + s.get(0).getCount());
		System.out.println("So luong Primary Student : " + s.get(0).getCountPrimary());
		for (Student student : s) {
			if(student.getStudentType() == 1 ){
				System.out.println(student.toString());
			}
		}
		System.out.println("So luong Secondary Student : " + s.get(0).getCountSecond());
		for (Student student : s) {
			if(student.getStudentType() == 2 ){
				System.out.println(student.toString());
			}
		}

	}
	public static void question7() throws Exception{
		List<Student> s = new ArrayList<Student>();
		s.add(new Student(1, "Hoang", 1));
		s.add(new Student(2, "nam", 2));
		s.add(new Student(3, "hieu", 2));
		s.add(new Student(4, "toan", 2));
		s.add(new Student(5, "Ngoc", 1));
		s.add(new Student(6, "thuy", 2));
		s.add(new Student(7, "dien", 1));
		s.add(new Student(8, "linh", 2));
		s.add(new Student(9, "linh", 2));
		
	}
}
