import java.util.Random;
import java.util.Scanner;

public class DatatypeCasting {

	public static void main(String[] args) {
		
		//question1();
		//question2(123);
		question2();
		
		
	}
	
	public static void question1() {
		// Question 1
		float floatSalaryOfAccount1 = 5240.5f;
		float floatSalaryOfAccount2 = 10970.055f;
		int intSalaryOfAccount1 = (int) floatSalaryOfAccount1;
		int intSalaryOfAccount2 = (int) floatSalaryOfAccount2;
		System.out.println(intSalaryOfAccount1);
		System.out.println(intSalaryOfAccount2);
	}
	
	public static void question2(){
		// Question 2
		Random random = new Random();
		int a = random.nextInt(10000);
		System.out.printf("%05d", a);
	}
	
	public static void question3(int a){
		String s = Integer.toString(a);
		String subS = s.substring(s.length() - 2);
		System.out.println("Solution 1 : " + subS);
		System.out.println("Solution 2 : " + (a%100));
	}
	
	public static void question4(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b = scanner.nextInt();
		scanner.close();
		System.out.println((float) a/b);
	}

}
