
public class CheckDatatypeCasting {

	public static void main(String[] args) {
		float salaryAcc1Float = 5240.5f;
		float salaryAcc2Float = 10970.055f;
		// convert from float to int
		int salaryAcc1Int = (int)salaryAcc1Float;
		int salaryAcc2Int = (int)salaryAcc2Float;
		System.out.println(salaryAcc1Int);
		System.out.println(salaryAcc2Int);
		String salaryAcc1String = salaryAcc1Int + "";
		String salaryString = String.valueOf(salaryAcc1Int);
		System.out.println(salaryAcc1String);
		System.out.println(salaryString);
		
		byte x = 100;
		// convert from byte to string
		String s = Byte.toString(x);
		System.out.println(s);
		// convert from string to byte
		byte y = Byte.parseByte(s);
		System.out.println(y);
		
		//  Object to String
		long x1 = 1000;
		// Convert from long to object
		Long y1 = Long.valueOf(x1);
		// Convert from object to string
		String s1 = y1.toString();
		// String to object
		Long t1 = Long.valueOf(s1);
		
		
		// cac ham khoi tao cua class
		// Primitive to Object
		long l = 1000;
		Long a = new Long(l);
		// String to Object
		String s2 = "2000";
		Long b = new Long(s2);
		System.out.println(t1 + a + s2 + b);
		
	
		
		
	}
	

}
