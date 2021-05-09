import java.util.Scanner;

public class StringT {

	public static void main(String[] args) {
//		question16("123abc456def789jkl", 3);
		question4();
		
	}

	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scanner.nextLine();
		scanner.close();
		String[] s1 = s.split("\\ ");
		System.out.println(s1.length);

	}

	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the second string : ");
		String s2 = scanner.nextLine();
		scanner.close();
		System.out.println(s1.concat(s2));
	}

	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a name : ");
		String s1 = scanner.nextLine();
		// check
		if (s1.substring(0, 1).equals(s1.substring(0, 1).toUpperCase())) {
			// System.out.println("True");
			System.out.println(s1);
		} else {
			// System.out.println("False");
			s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
			System.out.println(s1);
		}
		scanner.close();
	}

	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a name : ");
		String s = scanner.nextLine();
		scanner.close();
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the the last name : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the the first name : ");
		String s2 = scanner.nextLine();
		scanner.close();
		System.out.println(s1 + " " + s2);
	}

	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fullname : ");
		String s = scanner.nextLine();
		String[] s1 = s.split("\\ ");
		System.out.println("Ho la : " + s1[0]);
		System.out.print("Ten dem la : ");
		for (int i = 1; i < s1.length - 1; i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.println("\n" + "Ten la : " + s1[s1.length - 1]);
		scanner.close();
	}

	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fullname : ");
		String s = scanner.nextLine();
		scanner.close();
		String s1 = s.trim();
		System.out.println(s1);
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			s2[i] = s2[i].substring(0, 1).toUpperCase() + s2[i].substring(1);
		}
		for (String ss : s2) {
			System.out.print(ss + " ");
		}

	}

	public static void question8() {
		String[] groupList = { "Java basic", "Java Core", "Java Advance", "C# Advance", "SQL", "PHP" };
		for (String group : groupList) {
			if (group.contains("Java")) {
				System.out.println(group);
			}
		}
	}

	public static void question9() {
		String[] groupList = { "Java", "Java", "SQL", "Website" };
		for (String group : groupList) {
			if (group.equals("Java")) {
				System.out.println(group);
			}
		}
	}

	public static void question10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the second string : ");
		String s2 = scanner.nextLine();
		scanner.close();
		String s = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			s = s + s2.substring(i, i + 1);
		}
		if (s1.equals(s)) {
			System.out.println("There is the reverse string of each other");
		} else {
			System.out.println("There is not the reverse string of each other");
		}

	}

	

	
	public static void question11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fullname : ");
		String s = scanner.nextLine();
		scanner.close();
//		string to charArray
//		char[] a = s.toCharArray();
//		Character.valueoOf(s.charAt(i)).compareTo(Character.valueOf('a'))
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'a'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void question12ver1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fullname : ");
		String s = scanner.nextLine();
		scanner.close();
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1.reverse();
		System.out.println("The original string : " + s);
		System.out.println("The changed string : " + s1);
	}

	public static void question12ver2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scanner.nextLine();
		scanner.close();
		byte[] byteArrayOfs = s.getBytes();
		byte[] byteArrayOfs1 = new byte[byteArrayOfs.length];
		for (int i = 0; i < byteArrayOfs.length; i++) {
			byteArrayOfs1[i] = byteArrayOfs[byteArrayOfs.length - 1 - i];
		}
		String s1 = new String(byteArrayOfs1);
		System.out.println(s);
		System.out.println(s1);

	}
	
	public static void question12ver3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scanner.nextLine();
		scanner.close();
		String s1 ="";
		for(int i = s.length() - 1; i>= 0; i--){
			s1 = s1 + s.substring(i, i+1);
		}
		System.out.println(s1);
	}
	public static void question12ver4(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a string : ");
		String s = scanner.nextLine();
		scanner.close();
		String s1 ="";
		for(int i = s.length() - 1; i>= 0; i--){
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		
	}

	public static void question13() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scanner.nextLine();
		scanner.close();
		boolean check = true;
		for(int i = 0; i < s.length(); i++){
			if( Character.isDigit( s.charAt(i) ) ){
				check = false;
				break;
			}
		}
		System.out.println(check);

	}
	
	public static void question14(String a, String b, String c){
		System.out.println(a.replace(b,c));
	}
	// Question 15 tuong tu Question 12 + trim()
	// Question 16
	public static void question16(String s, int b){
		
		if(s.length() % b != 0 || s.equals(null) || s.isEmpty()){
			System.out.println("KO");
		}
		else{
			int numberOfString = s.length()/b;
			int numberCount = s.length();
			String[] s1 = new String[numberOfString];
			int i = 0, j = 0;
			//System.out.println("numberOfString : " + numberOfString);
			//System.out.println("numberCount : "+ numberCount);
			while(i < numberCount ){
				s1[j] = s.substring(i, i+b);
				i = i + b;
				j++;
			}
			for(int temp = 0; temp < numberOfString; temp ++){
				System.out.println(s1[temp]);
			}
			
		}
		
	}
}