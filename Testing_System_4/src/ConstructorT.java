import java.util.Date;

public class ConstructorT {
	public static void main(String[] args) {
		
		
	}
	
	// Question 1
	public static void question1(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		Department dept2 = new Department("Marketing");
		System.out.println("Dept 1 : " + dept1.id + "-" + dept1.name);
		System.out.println("Dept 2 : " + dept2.id + "-" + dept2.name);
	}
	// Question 2
	public static void question2(){
		Account a = new Account();
		Account b = new Account(1, "tran16875@gmail.com", "HoangTran","Tran", "Hoang");
		Position p = new Position();
		Account c = new Account(1, "tran16875@gmail.com", "HoangTran","Tran", "Hoang", p);
		Date da = new Date(2020/01/01);
		Account d = new Account(1, "tran16875@gmail.com", "HoangTran","Tran", "Hoang", p, da );
	}
	// Question 3
	public static void question3(){
		Group g1 = new Group();
		Account a = new Account();
		Account b = new Account();
		Account[] accounts = new Account[2];
		accounts[0] = a;
		accounts[1] = b;
		String[] userName = {"Hoang"};
		Date da = new Date(2020/01/01);
		Group g2 = new Group("Football", a, da, accounts);
		Group p3 = new Group("Travel", b, da, userName);
				
	}
}


