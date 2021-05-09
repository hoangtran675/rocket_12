package finalT;

public class MyMath {
	
	private final float PI = 3.1415f;
	
	public static void main(String[] args) {
		MyMath check = new MyMath();
		System.out.println(check.sum(10));
	}
	public float sum(int a){
		return PI + a;
	}

}
