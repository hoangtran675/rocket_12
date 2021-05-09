package generics;

public class Program {

	public static void main(String[] args) {
		MyGenericClass<String> a = new MyGenericClass("Hoang");
		a.displayObjectType();
		System.out.println(a.getObject());
	}

}
