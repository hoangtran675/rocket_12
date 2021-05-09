package backend;

public class Question1n2 {
	public static void main(String[] args) {
		try{
			float result = devide(7,0);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Can not divide 0");
		}finally{
			System.out.println("Divide completed");
		}
		
	}
	public static float devide(int a, int b){
		return a/b;
	}
}
