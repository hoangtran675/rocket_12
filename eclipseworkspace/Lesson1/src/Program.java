import java.util.Date;

public class Program {

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
	pos1.name = "PM";
	
	Position pos2 = new Position();
	pos2.id = 2;
	pos2.name = "DEV";
	
	Position pos3 = new Position();
	pos3.id = 3;
	pos3.name = "Leader";
	
	Account acc1 = new Account();
	acc1.id = 1;
	acc1.email = "tran16875@gmail.com";
	acc1.userName = "Hoang Tran";
	acc1.fullName = "Tran Van Hoang";
	acc1.department.id = 1;
	acc1.position.id = 2;
	acc1.createDate.getDate();
			
	Account acc2 = new Account();
	acc2.id = 2;
	acc2.email = "hoanbk@gmail.com";
	acc2.userName = "Hoan Pham";
	acc2.fullName = "Pham Van Hoang";
	acc2.department.id = 2;
	acc2.position.id = 1;
	acc2.createDate.getDate(); 
	
	Account acc3 = new Account();
	acc3.id = 3;
	acc3.email = "hieudinh@gmail.com";
	acc3.userName = "Hieu Dinh";
	acc3.fullName = "Dinh Quang Hieu";
	acc3.department.id = 3;
	acc3.position.id = 1;
	acc2.createDate.getDate();
	
	Group group1 = new Group();
	group1.id = 1;
	group1.name = "Van Nghe";
	group1.creator.id = 3; 
	group1.createDate.getDate();
	

	
	Group group2 = new Group();
	group2.id = 2;
	group2.name = "The Thao";
	group2.creator.id = 2;
	group2.createDate.getDate();
	
	Group group3 = new Group();
	group3.id = 3;
	group3.name = "Cong Doan";
	group3.creator.id = 2;
	group3.createDate.getDate();
	
	GroupAccount groupAcount1 = new GroupAccount();
	groupAcount1.group.id = 1;
	groupAcount1.account.id = 1;
	groupAcount1.joinDate.getDate();
	
	GroupAccount groupAcount2 = new GroupAccount();
	groupAcount2.group.id = 2;
	groupAcount2.account.id = 1;
	groupAcount2.joinDate.getDate();
	
	GroupAccount groupAcount3 = new GroupAccount();
	groupAcount1.group.id = 3;
	groupAcount1.account.id = 3;
	groupAcount3.joinDate.getDate();
	
	TypeQuestion typeQuestion1 = new TypeQuestion();
	typeQuestion1.id = 1;
	typeQuestion1.name = "Cau 1";
	
	TypeQuestion typeQuestion2 = new TypeQuestion();
	typeQuestion2.id = 2;
	typeQuestion2.name = "Cau 2";
	
	TypeQuestion typeQuestion3 = new TypeQuestion();
	typeQuestion3.id = 3;
	typeQuestion3.name = "Cau 3";
	
	CategoryQuesiton categoryQuestion1 = new CategoryQuesiton();
	categoryQuestion1.id = 1;
	categoryQuestion1.name = "Package 1"; 

	CategoryQuesiton categoryQuestion2 = new CategoryQuesiton();
	categoryQuestion2.id = 2;
	categoryQuestion2.name = "Package 2"; 
	
	CategoryQuesiton categoryQuestion3 = new CategoryQuesiton();
	categoryQuestion1.id = 3;
	categoryQuestion1.name = "Package 3";
	
	
	Question question1 = new Question();
	question1.id = 1;
	question1.content = "This is the content of the first question";
	question1.category.id = 1;
	question1.typeID = 1;
	question1.creator.id = 1;
//	question1.createDate.getDate());
	
	Question question2 = new Question();
	question2.id = 2;
	question2.content = "This is the content of the second question";
	question2.category.id = 1;
	question2.typeID = 1;
	question2.creator.id = 2;
//	question2.createDate.getDate());
	
	Question question3 = new Question();
	question3.id = 3;
	question3.content = "This is the content of the third question";
	question3.category.id = 2;
	question3.typeID = 2;
	question3.creator.id = 3;
//	question4.createDate.getDate());
	
	Answer answer1 = new Answer();
	answer1.id = 1;
	answer1.content = "This is content of the first answer";
	answer1.question.id = 1;
	answer1.isCorrect = true;
	
	Answer answer2 = new Answer();
	answer2.id = 2;
	answer2.content = "This is content of the second answer";
	answer2.question.id = 2;
	answer2.isCorrect = false;
	
	Answer answer3 = new Answer();
	answer3.id = 3;
	answer3.content = "This is content of the third answer";
	answer3.question.id = 2;
	answer3.isCorrect = true;
	
	
	
	
	
	
	
	}

}
