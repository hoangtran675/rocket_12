package com.vti.FinalExam.utils;

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
	// INPUT EMAIL
	public static String inputEmail(String message){
		while (true) {
			String email = ScannerUtils.inputString();
			if (email == null || !email.contains("@vti.com.vn")) {
				System.err.println(message);
				System.out.print("Input email: ");
			} else {
				return email;
			}
		}
	}
	// INPUT PASSWORD
	public static String inputPassword(String message, int min, int max){
		while (true) {
			String password = ScannerUtils.inputString();
			if (password.length() < min || password.length() > max) {
				System.err.println(message);
				System.out.print("Input password: ");
				continue;
			}

			boolean hasAtLeast1Character = false;

			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i)) == true) {
					hasAtLeast1Character = true;
					break;
				}
			}
			if (hasAtLeast1Character == true) {
				return password;
			} else {
				System.err.println(message);
				System.out.print("Input password: ");
			}
		}
	}
	// INPUT PHONE NUMBER
	public static String inputPhoneNumber(String message) {
		while (true) {
			String number = ScannerUtils.inputString();
			if (number.length() > 12 || number.length() < 9) {
				System.err.println(message);
				continue;
			}

			if (number.charAt(0) != '0') {
				System.err.println(message);
				continue;
			}

			boolean isNumber = true;

			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i)) == false) {
					isNumber = false;
					break;
				}
			}
			if (isNumber == true) {
				return number;
			} else {
				System.out.println(message);
				System.out.print("Input phone number: ");
			}

		}
	}

}
