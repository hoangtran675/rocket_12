
public class BoxingAndUnboxing {

	public static void main(String[] args) {
		question3();
	}

	public static void question1() {
		Integer a = 5000;
		float f = a.floatValue();
		System.out.printf("%.2f", f);
	}
	public static void question2(){
		String s = "1234567";
		int a = Integer.parseInt(s);
		System.out.println(a);
	}

	public static void question3(){
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println(b);
	}
}
