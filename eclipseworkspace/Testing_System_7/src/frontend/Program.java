package frontend;

import java.util.ArrayList;
import java.util.List;

import backend.staticT.HinhChuNhat;
import backend.staticT.HinhHoc;
import backend.staticT.HinhHocException;
import backend.staticT.HinhTron;
import backend.staticT.QuestionDemo;
import backend.staticT.Student;

public class Program {
	public static QuestionDemo question ;
	public static void main(String[] args) throws Exception {
		question = new QuestionDemo();
		// int result = Math.max(5, 5);
		// System.out.println(result);
		//question2();
		
//		try {
//			question7();
//		} catch (Exception e) {
//			System.err.println(e.getMessage());;
//		}
//		System.out.println("Hoang");
//		HinhHoc t1 = new HinhTron(3f);
//		System.out.println(HinhHoc.countHinhHoc);
//		
//		HinhHoc t2 = new HinhTron(4f);
//		System.out.println(HinhHoc.countHinhHoc);
//		
//		HinhHoc hcn1 = new HinhChuNhat(3f, 5f);
//		System.out.println(HinhHoc.countHinhHoc);
//		
//		HinhHoc hcn2 = new HinhChuNhat(2f, 2.5f);
//		System.out.println(HinhHoc.countHinhHoc);
//		HinhHoc hcn4 = new HinhChuNhat(2f, 2.5f);
//		System.out.println(HinhHoc.countHinhHoc);
//		HinhHoc hcn5 = new HinhChuNhat(2f, 2.5f);
//		System.out.println(HinhHoc.countHinhHoc);
		question7();
		
		
		

	}

	// Question 1
	public static void question1(){
		question.question1();
	}

	// Question 2
	public static void question2(){
		question.question2();
	}
	

	// question3 trong class MyMath
	// Question4 trong Student
	// Question5
	public static void question5(){
		question.question5();
	}

	// Question 6
	public static void question6() throws Exception{
		question.question6();
	}
	// Question 7
	public static void question7() throws Exception{
		question.question7();
	}
	// Question 8, 9 trong main
}
