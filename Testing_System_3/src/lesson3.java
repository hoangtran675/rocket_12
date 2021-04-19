import testprograms.Person;

public class lesson3 {
	public static void main(String[] args) {
//		int a = 8;
//		long b = (long) a;
//		Integer aInteger = 5;
//		long z = aInteger.MAX_VALUE + 3L; // int + long = long, theo kieu lon hon
//		int c = (int) z;
//		System.out.println(z + " " + c);
////		System.out.println("int -> long : " + b);
////		System.out.println("long -> int : " + c);
////				
//		System.out.println("Max of Integer : " + aInteger.MAX_VALUE);
//		System.out.println("Min of Integer : " + aInteger.MIN_VALUE);
//		int a = 1;
//		float b = 1f;
//		int c = 2;
//		float d = (float)a/c;
//		System.out.println(d + "");
//		Dog dog = new Dog();
//		System.out.println(dog.thoiGianAn("Banh Mi", 3));
//		System.out.println(dog.thoiGianAn("Xuc Xich", 3));
//		soSanhString();
		Person p = new Person("HOANG",20);
//		p.name = "hoang";
//		p.age = 23;
		System.out.println(p.toString());
		
	}
	public static void stringToInt(){
		String a = "5";
		int b = Integer.valueOf(a);
		System.out.println(b);
		int c = b + 1;
		int e = Integer.MAX_VALUE;
	}
	public static void soSanhString(){
		String a = "abc";
		String b = "xyz";
		String c = new String("abc");
		System.out.println(a==c);
		System.out.println(a.equals(b));
	}
}
