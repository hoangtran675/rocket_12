package backend;

public class DangKiThiBangLai {

	public static void main(String[] args) {
//		try {
//			dangKiThiBangLai(15);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//			System.out.println("------------------");
//			System.out.println(e.getMessage());
//		}
		testHoang(0);
	}

	public static void dangKiThiBangLai(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Khong du tuoi thi bang lai");
		} else {
			System.out.println("Du tuoi lai xe may");
		}
	}

	public static void testHoang(int a) {
		try {
			float test = 10f / a;
			int check = 3;
			System.out.println(test + "                hhhhhhhhhhh");
		} catch (ArithmeticException r) {
			System.err.println("khong the chia 0");
		}finally{
		System.out.println("Finally is here");
		}
		
		System.out.println("Finally is here also");

	}

}
