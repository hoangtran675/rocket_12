package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GroupException {
	private int id;
	private String name;
	private AccountException creator;
	public List<AccountException> accounts;

	public GroupException() {
		System.out.print("Nhap id group : ");
		id = ScannerUtils.inputInt("This is not a Integer Number !");
		System.out.print("Nhap ten group : ");
		name = ScannerUtils.inputString();
		System.out.println("---------- Nhap creator cho group : ");
		creator = new AccountException();
//		int checkAddAcc = 1;
		accounts = new ArrayList<AccountException>();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.println("Do you want to add more account to Account Array ?");
			System.out.println("Press Number 1 : Yes\nPress Any Other Numbers : No");
			int checkAddAcc = scanner.nextInt();
			if (checkAddAcc != 1) {
				scanner.close();
				break;
			} else {
				AccountException acc = new AccountException();
				accounts.add(acc);
			}
			
		}
		scanner.close();
		// }while(checkAddAcc == 1);

	}

	public String toInforString() {
		return "Group ID : "+ id + "\nGroup Name : " +name + "\nGroup Creator : " + creator;
	}

	public List<AccountException> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountException> accounts) {
		this.accounts = accounts;
	}

}
