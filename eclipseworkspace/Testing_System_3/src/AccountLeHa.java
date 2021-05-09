

import java.time.LocalDate;
import java.util.Date;

public class AccountLeHa {


	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {

			accounts[i] = new Account();
			accounts[i].email = "Email " + i;
			accounts[i].userName = "Username" + i;
			accounts[i].fullName = "Fullname" + i;
			accounts[i].createDate = new Date();
		}
		for (Account account : accounts) {
			System.out.println("Email :" +  account.email);
		}
		
	}

}