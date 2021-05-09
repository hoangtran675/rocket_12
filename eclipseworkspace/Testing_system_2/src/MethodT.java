
public class MethodT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question3();

	}
	public static void question1(){
		System.out.println("In ra cac so nguyen duong chan nho hon 10");
		for(int i = 1; i < 10; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
	public static void question2(){
		Account acc1 = new Account();
		acc1.email = "tran16875@gmail.com";
		acc1.userName = "TranHoang";
		acc1.fullName = "Tran Van Hoang";
		Account acc2 = new Account();
		acc2.email = "hoan16875@gmail.com";
		acc2.userName = "PhamHoang";
		acc2.fullName = "PhamVanHoan";
		Account[] acc = {acc1, acc2};
		for(int i = 0; i < acc.length; i++){
			System.out.println(acc[i].email);
			System.out.println(acc[i].userName);
			System.out.println(acc[i].fullName);
		}
	}
	public static void question3(){
		System.out.println("In ra cac so nguyen duong chan nho hon 10");
		for(int i = 1; i < 10; i++){
				System.out.println(i);
		}
	}

}
