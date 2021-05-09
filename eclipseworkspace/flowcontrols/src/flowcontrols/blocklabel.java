package flowcontrols;
import java.util.Scanner;

public class blocklabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 20;
		l1: {
			
			System.out.println("Block begins");
			if(i == 20)
				break l1;
			System.out.println("Block ends");
		}
		System.out.println("Outside the block");
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("User enters a value : ");
		int n;
		n = sc.nextInt();
		/* kiem tra so nguyen to
		System.out.println(n);
		boolean primeFlag = true;
		for(int i = 2; i < n; i++){
			if(n%i == 0)	primeFlag = false;
			
		}
		if(primeFlag == true) 
			System.out.println( n + " la so nguyen to.");
		else
			System.out.println(n + " khong phai la so nguyen to.");
		*/
		for(int i = 0; i <= n; i++){
			if(i%10 == 0) continue;
			else 
				System.out.println(i);
		}
	}

}
