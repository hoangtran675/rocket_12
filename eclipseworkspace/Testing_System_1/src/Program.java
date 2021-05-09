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
		
		GroupAccount groupAcount1 = new GroupAccount();
		groupAcount1.group = group1;
		groupAcount1.account = acc1;
		
		
		GroupAccount groupAcount2 = new GroupAccount();
		groupAcount2.group = group2;
		groupAcount2.account = acc2;
		
		
		GroupAccount groupAcount3 = new GroupAccount();
		groupAcount3.group = group3;
		groupAcount3.account = acc3;
		
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.typeName = TYPE_QUESTION.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.typeName = TYPE_QUESTION.MULTIPLE_CHOICE;
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.id = 3;
		typeQuestion3.typeName = TYPE_QUESTION.MULTIPLE_CHOICE;
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Package 1"; 

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "Package 2"; 
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion1.id = 3;
		categoryQuestion1.name = "Package 3";
		
		
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "This is the content of the first question";
		question1.category = categoryQuestion2;
		question1.typequestion = typeQuestion1;
		question1.creator = acc1;
		question1.createDate = new Date(2019/01/01);
		
		Question question2 = new Question();
		question2.id = 2;
		question2.content = "This is the content of the second question";
		question2.category = categoryQuestion1;
		question2.typequestion = typeQuestion2;
		question2.creator = acc2;
		question2.createDate = new Date(2019/02/01);
		
		Question question3 = new Question();
		question3.id = 3;
		question3.content = "This is the content of the third question";
		question3.category = categoryQuestion1;
		question3.typequestion = typeQuestion1;
		question3.creator = acc3;
		question3.createDate = new Date(2019/03/01);

		
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "This is content of the first answer";
		answer1.question = question1;
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "This is content of the second answer";
		answer2.question = question2;
		answer2.isCorrect = false;
		
		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "This is content of the third answer";
		answer3.question = question3;
		answer3.isCorrect = true;
		
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "1101";
		exam1.title = "Java test";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creator = acc1;
		exam1.createDate = new Date(2019-01-01);
		
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "1001";
		exam2.title = "Java test";
		exam2.category = categoryQuestion3;
		exam2.duration = 90;
		exam2.creator = acc2;
		exam2.createDate = new Date(2019-02-01);
		
		
		Exam exam3 = new Exam();
		exam3.id = 2;
		exam3.code = "1111";
		exam3.title = "Java test";
		exam3.category = categoryQuestion2;
		exam3.duration = 120;
		exam3.creator = acc2;
		exam3.createDate = new Date(2019-03-01);
	
		Exam[] examOfQuestion1 = {exam1};
		question1.exams = examOfQuestion1;
		
		Exam[] examOfQuestion2 = {exam1, exam2};
		question2.exams = examOfQuestion2;
		
		Exam[] examOfQuestion3 = {exam1, exam2, exam3};
		question3.exams = examOfQuestion3;
		
		Question[] questionOfExam1 = {question1};
		exam1.questions = questionOfExam1;
		
		Question[] questionOfExam2 = {question1, question2};
		exam2.questions = questionOfExam2;
		
		Question[] questionOfExam3 = {question1, question2, question3};
		exam3.questions = questionOfExam3;
	}

}
