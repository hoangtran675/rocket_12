import java.util.Scanner;

public class Lesson2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		if(scanner.hasNextInt()){
			int a = scanner.nextInt();
			System.out.println( a+"");
		}
		else{
			System.out.println("Not Int");
		}
		

		scanner.close();
	}
}
