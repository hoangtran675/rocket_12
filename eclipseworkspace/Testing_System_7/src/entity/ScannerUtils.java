package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
	public static Scanner sr = new Scanner(System.in);

	// INPUT INT
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				//System.out.println("Nhap vao so int : ");
				int ipInt = sr.nextInt();
				// sr.close();
				return ipInt;
			} catch (InputMismatchException e) {
				sr.nextLine();
				System.err.println(errorMessage);
			}
		}
	}

	// INPUT FLOAT
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				float ipFloat = sr.nextFloat();
				// sr.close();
				return ipFloat;
			} catch (InputMismatchException e) {
				sr.nextLine();
				System.err.println(errorMessage);
			}
		}
	}

	// INPUT DOULE
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				double ipDouble = sr.nextDouble();
				// sr.close();
				return ipDouble;
			} catch (InputMismatchException e) {
				sr.nextLine();
				System.err.println(errorMessage);
			}
		}
	}

	// INPUT STRING
	public static String inputString() {
		while (true) {
			Scanner s = new Scanner(System.in);
			String ipString = s.nextLine();
			ipString = ipString.trim();
			if (ipString.isEmpty()) {
				System.out.println("Nhap lai chuoi : ");
			} else {
				return ipString;
			}
		}

	}

	// INPUT AGE
	public static int inputAge() {
		while (true) {
			System.out.print("Nhap vao so tuoi : ");
			try {
				int age = sr.nextInt();
				if (age < 0) {
					System.err.println("Wrong inputing! The age must be greater than 0, please input again");
				} else {
					return age;
				}
			} catch (InputMismatchException e) {
				sr.nextLine();
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
		}
	}

}
