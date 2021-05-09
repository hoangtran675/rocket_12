package superkeyword;

public class SuperClass {
	int x;
	SuperClass(){
		System.out.println("There is no agrument of Super Class 1 : ");
	}
	SuperClass(int x){
		this();   // goi ham khoi tao khong co tham so ben tren : SuperClass()
		this.x = x;
		System.out.println("There is one agrument of Super Class 2 x : " + this.x);
	}
}
