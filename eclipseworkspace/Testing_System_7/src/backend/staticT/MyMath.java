package backend.staticT;

public class MyMath {
	
	public static int myMax(int a, int b){
		if(a > b) return a;
		else if(a < b) return b;
		else return a;
	}
	
	public static int myMin(int a, int b){
		if(a > b) return b;
		else if(a < b) return a;
		else return a;
	}
	public static int mySum(int a, int b){
		return a+b;
	}
}
