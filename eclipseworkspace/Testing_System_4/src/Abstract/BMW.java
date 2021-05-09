package Abstract;

public abstract class BMW {
	// tao phuong thuc binh thuong
	void commonFunc(){
		System.out.println("Inside function method");
	}
	// phuong thuc abstract
	// nghia la phuong thuc nay se bi giau di
	abstract void accelerate(); // phuong thuc abstract
	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}
}
