package backend.staticT;

public class testexception {

	public static void main(String[] args) {
		testexception n = new testexception();
		try {
			n.check(7);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		//System.out.println("More code can go here");
	}

	public static void check(int a) throws Exception {
		if (a > 5) {
			throw new Exception("loix");
		} else {
			System.out.println("success");
		}
	}

}
