package backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question5 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		inputAge();
	}

	public static int inputAge() {
	while(true){
		System.out.print("Nhap vao so tuoi : ");
		try{
			int age = sc.nextInt();
			if(age < 0){
				System.err.println("Wrong inputing! The age must be greater than 0, please input again");
			}else{
				return age;
			}
		}catch(InputMismatchException e){
			sc.nextLine();
			System.out.println("wrong inputing! Please input an age as int, input again.");
		}
	}

	}
}
