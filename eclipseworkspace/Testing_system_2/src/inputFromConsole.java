import java.util.Date;
import java.util.Scanner;

public class inputFromConsole {

	public static void main(String[] args) {

		question_8();
		
		
		
		}

	

	// Question 1
	public static void question_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Question 1 :  Enter 3 interger numbers");
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
	}

	// Question 2
	public static void question_2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Question 2 :  Enter 2 float numbers");
		float[] a2 = new float[3];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = scanner.nextFloat();
		}
		scanner.close();
	}

	// Question 3
	public static void question_3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten : ");
		scanner.nextLine();
		scanner.close();
	}

	// Question 4
	public static void question_4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ngay sinh :");
		scanner.nextLine();
		scanner.close();
	}

	// Question 5
	public static void question_5() {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		account.position = new Position();

		System.out.println("Enter the Property Position : ");
		if (scanner.hasNextInt()) {
			int a = scanner.nextInt(6);
			switch (a) {
			case 1:
				account.position.name = Position_name_enum.DEV;
				break;
			case 2:
				account.position.name = Position_name_enum.TEST;
				break;
			case 3:
				account.position.name = Position_name_enum.SCRUM_MASTER;
				break;
			case 4:
				account.position.name = Position_name_enum.PM;
			}
		}
		System.out.println(account.position.name);
		scanner.close();
	}

	// Question 6 : same as question 5
	// Question 7
	public static void question_7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an even number : ");
		if (scanner.hasNextInt()) {
			boolean check = false;
			do {
				int a = scanner.nextInt();
				if (a % 2 != 0) {
					check = false;
					System.out.println("It is not even number : ");
				} else {
					check = true;
					System.out.println("Correctly ! : " + a);
				}
			} while (check == false);

		}
		scanner.close();
	}
	// Question 8
	public static void question_8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number 1 for creating an Account\nNumber 2 for creating a Department");
		boolean check = false;
		do {
			System.out.println("Enter a number : ");
			int a = scanner.nextInt();
			if (a == 1) {
				Account account = new Account();
				System.out.println("You have just created an account");
				check = true;
			} else if (a == 2) {
				Department department = new Department();
				System.out.println("You have just created a department");
				check = true;
			}
		} while (check == false);
		scanner.close();
	}
	// Question 9
	public static void question_9(){
		Department dept1 = new Department();
		dept1.id = 1;
		dept1.name = "Sale";
		
		Department dept2 = new Department();
		dept2.id = 2;
		dept2.name = "Security";
		
		Department dept3 = new Department();
		dept3.id = 1;
		dept1.name = "Sale";
		
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = Position_name_enum.DEV;
		
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = Position_name_enum.TEST;
		
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = Position_name_enum.SCRUM_MASTER;
		
		
		
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "tran16875@gmail.com";
		acc1.userName = "Hoang Tran";
		acc1.fullName = "Tran Van Hoang";
		acc1.department = dept1;
		acc1.position = pos1;
		acc1.createDate = new Date(2020/01/01);
		
				
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "hoanbk@gmail.com";
		acc2.userName = "Hoan Pham";
		acc2.fullName = "Pham Van Hoang";
		acc2.department = dept1;
		acc2.position = pos2;
		acc2.createDate = new Date(2020/01/02);
		 
		
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "hieudinh@gmail.com";
		acc3.userName = "Hieu Dinh";
		acc3.fullName = "Dinh Quang Hieu";
		acc3.department = dept2;
		acc3.position = pos1;
		acc3.createDate = new Date(2020/01/04);
		
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Van Nghe";
		group1.creator = acc1; 
		group1.createDate = new Date(2019/01/01);
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "The Thao";
		group2.creator = acc3;
		group2.createDate = new Date(2019/02/01);
		
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Cong Doan";
		group3.creator = acc2;
		group3.createDate = new Date(2019/03/01);
		
		Group[] groupOfAcc1 = new Group[10];
		for(Group hoang : groupOfAcc1){
			hoang = new Group();
		}
		groupOfAcc1[0] = group1;
		acc1.groups = groupOfAcc1;
		
		
		Group[] groupOfAcc2 = new Group[10];
		for(Group hoang : groupOfAcc2){
			hoang = new Group();
		}
		groupOfAcc2[0] = group1;
		groupOfAcc2[1] = group2;
		acc2.groups = groupOfAcc2;
		
		Group[] groupOfAcc3 = new Group[10];
		groupOfAcc3[0] = group1;
		groupOfAcc3[1] = group2;
		groupOfAcc3[2] = group3;
		
		acc3.groups = groupOfAcc3;
		
		Account[] accountOfGroup1 = new Account[10];
		accountOfGroup1[0] = acc1;
		group1.accounts = accountOfGroup1;
		
		Account[] accountOfGroup2 = new Account[10];
		accountOfGroup2[0] = acc1;
		accountOfGroup2[1] = acc2;
		group2.accounts = accountOfGroup2;
		
		Account[] accountOfGroup3 = {acc1, acc2, acc3};
		group3.accounts = accountOfGroup3;
		
		for(Account check : group2.accounts){
			System.out.println(check.userName);
		}
		Group[] groups = {group1, group2, group3};
		Account[] accounts = {acc1, acc2, acc3};
		System.out.println("--------------All accounts--------------");
		for(Account element : accounts){
			System.out.println(element.userName);
		}
		
		System.out.println("Enter one of these UserName");
		Scanner scanner = new Scanner(System.in);
		String userNameFromConsole = scanner.nextLine();
		System.out.println("Tham gia cac group sau : ");
		boolean checkAccountOfGroup = false;
		for(int i = 0; i < groups.length ; i++){
			for(int j = 0 ; j < groups[i].accounts.length; j++){
				if(groups[i].accounts[j].userName.equals(userNameFromConsole)){
				checkAccountOfGroup = true;
				}
			}
			if(checkAccountOfGroup == true){
				System.out.println(groups[i].name);
				checkAccountOfGroup = false;
			}	
		}
		System.out.println("--------------All groups--------------");
		for(Group element : groups){
			System.out.println(element.name);
		}
		String groupFromConsole = scanner.nextLine();
		Account accountResult = new Account();
		for(Account account_t : accounts){
			if(account_t.userName.equals(userNameFromConsole)){
				accountResult = account_t;
				break;
			}
		}
		System.out.println("-------------- Account Result la : " + accountResult.userName);
		for(Group element : groups){
			if(element.name.equals(groupFromConsole)){
				System.out.println("Group duoc chon la : " + element.name);
				for(Account account: element.accounts){
					if(account.userName.equals(null)){
						account = accountResult;
					}
				}
//				break;
			}
		}
		/* Cach 2 : tao mot group khac do group ban dau da fix cung so phan tu
		for(int i = 0; i < groups.length; i++){
			if(groups[i].name.equals(groupFromConsole)){
				Group group_change = new Group();
				group_change.id = groups[i].id;
				group_change.name = groups[i].name;
				group_change.creator = groups[i].creator;
				group_change.createDate = groups[i].createDate;
				Account[] accountOfGroupChange = new Account[(groups[i].accounts.length) + 1];
				group_change.accounts = accountOfGroupChange;
				
				for(int j = 0 ; i < groups[i].accounts.length; j++){
					group_change.accounts[j] = groups[i].accounts[j];
				}
				for(Account element : accounts){
					if(element.userName.equals(userNameFromConsole)){
						group_change.accounts[groups[i].accounts.length] = element;
					}
					break;
				}
				break;
			}
		}
		*/
		scanner.close();
		System.out.println("-----------Day la ket qua-----------");
		for(Account account : group2.accounts){
			System.out.println(account.fullName);
		}
	}

}
