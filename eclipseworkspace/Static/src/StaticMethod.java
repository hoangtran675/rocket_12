
public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("Inside main");
		test();

	}
	static void test(){
		System.out.println("Inside static method");
	}
}
