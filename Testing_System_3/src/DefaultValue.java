import java.util.Date;

public class DefaultValue {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		//Scanner scanner = new Scanner();
		for(int i = 0 ; i < accounts.length; i++){
			accounts[i] = new Account();
			accounts[i].email = "Email " + (i+1);
			accounts[i].userName = "Username " + (i+1);
			accounts[i].fullName = "Fullname" + (i+1);
			accounts[i].createDate = new Date();
		}
		for(Account account : accounts){
			System.out.println(account.email);
			System.out.println(account.userName);
			System.out.println(account.fullName);
			System.out.println(account.createDate);
		}
	}

}
