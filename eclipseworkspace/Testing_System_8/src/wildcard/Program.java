package wildcard;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
//	Integer a = new Integer(5);
//	Integer b = new Integer(10);
//	if(a<b) {
//		System.out.println("1000");
//	}
//	}
//	
//	public static void question1(){
//		Salary s1 = new Salary(1);
//		Salary s2 = new Salary(1.0f);
//		Salary s3 = new Salary(1.2345d);
//		System.out.println("s1 : " + s1.getSalary());
//		System.out.println("s2 : " + s2.getSalary());
//		System.out.println("s3 : " + s3.getSalary());
//	
//	MyMath a = new MyMath();
//	System.out.println(a.max(10, 2.5));
//	MyMath<Integer> aInteger = new MyMath<Integer>();
//	System.out.println(aInteger.sum(100, 1000, 10000));
//	System.out.println(aInteger.sum(20, 200, 2000, 20000));
//	
//	MyMath<Float> aFloat = new MyMath<Float>();
//	System.out.println(aFloat.sum(100.01f, 12f));
		
//	MyMath<Integer> minusInteger = new MyMath<Integer>();
//	System.out.println(minusInteger.minus(10, 2));
//	MyMath<Float> minusFloat = new MyMath<Float>();
//	System.out.println(minusFloat.minus(5.4f, 1.2f));
		
//	MyMath<Integer> hoang = new MyMath<Integer>();
//	System.out.println(hoang.pow(4, 2));
//	MyMath<Float> hoangFloat = new MyMath<Float>();
//	System.out.println(hoangFloat.pow(1.5f, 3));
	
	ArrayList<Object> listWildcards = new ArrayList<>();
	listWildcards.add(new String("Nguyen Van Nam"));
	listWildcards.add(30);
	listWildcards.add("Ha Dong - Ha Noi");
	for (Object object : listWildcards) {
		System.out.println(object);
	}
	}
}
