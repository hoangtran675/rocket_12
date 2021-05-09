package superkeyword;

public class Child extends Parent {
	int c,d;
	Child(int a, int b, int c, int d){
		super(a,b);	
		this.c = c;
		this.d = d;
	}
	@Override
	void f1(){
		super.f1();
		System.out.println("Inside Parent f1 over ride inside Child");
	}
	void display(){
		System.out.println("Khoi tao tu Class Parent a : " + super.a);
		System.out.println("Khoi tao tu Class Parent b : " + super.b);
		System.out.println("Khoi tao tu Class Child c : " + this.c);
		System.out.println("Khoi tao tu Class Child d : " + this.d);
	}
}
