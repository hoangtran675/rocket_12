package backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question6 {
	public static Scanner sr = new Scanner(System.in);
	public static void main(String[] args) {
		
		sr.close();
	}
	
	// GET AGE
	public static int getAge() {
		while(true){
			System.out.print("Nhap vao so tuoi : ");
			try{
				int age = sr.nextInt();
				if(age < 0){
					System.err.println("Wrong inputing! The age must be greater than 0, please input again");
				}else{
					return age;
				}
			}catch(InputMismatchException e){
				sr.nextLine();
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
		}
	}
}
