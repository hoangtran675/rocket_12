package superkeyword;

public class SuperChild extends SuperClass {
	SuperChild() {
//		this(10);   // this nay la goi Constructor ben duoi : SuperChild(int x)
		System.out.println("There is no agrument of SuperChild 1:");
	}

	SuperChild(int x) {
		super(x);    // goi ham khoi tao cua ben SuperClass : SuperClass(int x)
		System.out.println("There is no agrument of SuperChild 2:");
	}

	public static void main(String[] args) {
		// Nhin vao () cua new SuperChild() de biet la khoi tao doi tuong voi dang Constructor nao
		SuperChild a = new SuperChild(10);  // khoi tao doi tuong voi dang constructor dang : SuperChild(int x)
		SuperChild b = new SuperChild();  	// khoi tao doi tuong voi dang constructor dang : SuperChild()
		}
}
