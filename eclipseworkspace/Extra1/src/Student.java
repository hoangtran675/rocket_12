import java.util.Date;

public class Student {
	String fullName;
	Date dayOfBirth;
	String homeTown;
	String major;
	String classOfMajor;
	String[] currentClass;
	String[] currentClassCode;
	LEVEL_EDUCATION level;
	GENDER gender;
	public static void goToSchool(){
		System.out.println("Go to school");
	}
	public static void goToExam(){
		System.out.println("Go to exam");
	}
	public static void payTuition(){
		System.out.println("Pay tuition");
	}
	public static void registerClass(){
		System.out.println("Register class");
	}
	public static void registerClud(){
		System.out.println("Register club");
	}
	public static void joinActivities(){
		System.out.println("Join activities of club");
	}
}
