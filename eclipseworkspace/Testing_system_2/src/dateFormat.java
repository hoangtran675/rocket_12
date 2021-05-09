import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateFormat {

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
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Package 1"; 
		
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "1101";
		exam1.title = "Java test";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creator = acc1;
		exam1.createDate = new Date(2019-01-01);
		
		// Question 1
		Locale locale = new Locale("vi","VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(exam1.createDate);

		
		System.out.println("id : "+ exam1.id);
		System.out.println("code : "+ exam1.code);
		System.out.println("title : "+ exam1.title);
		System.out.println("Category name : "+ exam1.category.name);
		System.out.println("Category id : "+ exam1.category.id);
		System.out.println("duration : "+ exam1.duration);
		System.out.println("creator : "+ exam1.creator.fullName);
		System.out.println("createDate : " + date);
		
		// Question 2
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(exam1.createDate);
		System.out.println("createDate of exam1 : " + date1);
		// Question 3
	//	System.out.println("Year of creating exam1 " + (exam1.createDate.getYear() + 1900));
		String pattern2 = "yyyy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String date2 = simpleDateFormat2.format(exam1.createDate);
		System.out.println("createDate of exam1 : " + date2);
		// Question 4
		String pattern3 = "yyyy-MM";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
		String date3 = simpleDateFormat3.format(exam1.createDate);
		System.out.println("createDate of exam1 : " + date3);
		// Question 5
		String pattern4 = "MM-dd";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern4);
		String date4 = simpleDateFormat4.format(exam1.createDate);
		System.out.println("createDate of exam1 : " + date4);
	}

	

}
