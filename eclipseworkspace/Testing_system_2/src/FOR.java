import java.util.Date;

public class FOR {

	public static void main(String[] args) {
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
		
		Group[] groupOfAcc1 = {group1};
		acc1.groups = groupOfAcc1;
		
		Group[] groupOfAcc2 = {group1, group2};
		acc2.groups = groupOfAcc2;
		
		Group[] groupOfAcc3 = {group1, group2, group3};
		acc3.groups = groupOfAcc3;
		
		Account[] accountOfGroup1 = {acc1};
		group1.accounts = accountOfGroup1;
		
		Account[] accountOfGroup2 = {acc1, acc2};
		group2.accounts = accountOfGroup2;
		
		Account[] accountOfGroup3 = {acc1, acc2, acc3};
		group3.accounts = accountOfGroup3;
		
		// Question 10
		Account[] accounts = {acc1, acc2, acc3};
		for(int i = 0; i < accounts.length; i++){
			System.out.println("The information acc number " + (i+1) +" are :");
			System.out.println("Email : " + accounts[i].email);
			System.out.println("Full name : " + accounts[i].fullName);
			System.out.println("Department : " + accounts[i].department.name);
		}
		 // Question 11
		Department[] departments = {dept1, dept2, dept3};
		for(int i = 0; i < departments.length; i++){
			System.out.println("The information department number " + (i+1) +" are :");
			System.out.println("Id : " + departments[i].id);
			System.out.println("Name : " + departments[i].name);
		}
		
		// Question 12
		for(int i = 0; i < 2; i++){
			System.out.println("The information department number " + (i+1) +" are :");
			System.out.println("Id : " + departments[i].id);
			System.out.println("Name : " + departments[i].name);
		}
		// Question 13
		System.out.println("-----------------------------------------------------Question 13");
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i] == acc2) continue;
			System.out.println("The information acc number " + (i+1) +" are :");
			System.out.println("Email : " + accounts[i].email);
			System.out.println("Full name : " + accounts[i].fullName);
			System.out.println("Department : " + accounts[i].department.name);
		}
		// Question 14
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i].id < 4){
			System.out.println("The information acc number " + (i+1) +" are :");
			System.out.println("Email : " + accounts[i].email);
			System.out.println("Full name : " + accounts[i].fullName);
			System.out.println("Department : " + accounts[i].department.name);
			}
		}
		// Question 15
		for(int i = 0 ; i <= 20 ; i++){
			if(i%2 == 0){
				System.out.print(i+"\t");
			}
		}

	}

}
