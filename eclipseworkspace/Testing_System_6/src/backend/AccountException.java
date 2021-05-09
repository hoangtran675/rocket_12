package backend;

import java.util.Date;

public class AccountException {
	private int id;
	private String email;
	private String userName;
	
	AccountException(){
		System.out.print("Tao id cho account : ");
		id = ScannerUtils.inputInt("This is not a Integer Number !");
		System.out.print("Tao email cho account : ");
		email = ScannerUtils.inputString();
		System.out.print("Tao username cho account : ");
		userName = ScannerUtils.inputString();
	}
	@Override
	public String toString() {
		return "Account ID : " + id + "\nAccount Email : " + email + "\nAccount Username : " + userName;
	}
	
}
