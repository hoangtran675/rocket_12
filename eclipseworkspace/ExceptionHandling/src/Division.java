import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner src = new Scanner(System.in);
		System.out.println("Nhap vao hai so nguyen : ");
		try{
		a = src.nextInt();
		b = src.nextInt();
		c = a/b;
		System.out.println("Ket qua la : " + c);
		src.close();
		}catch(ArithmeticException e){
			System.out.println("Do not enter the 0 number as second number");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("Co Try-Catch nen dong code tiep theo van chay binh thuong");
	}

}
