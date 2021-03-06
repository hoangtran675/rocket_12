package backend.staticT;

public class Student {
	private int id;
	private String name;
	static private String college;
	public static int groupMoney = 0;
	private static int count = 0;
	private static int countPrimary = 0;
	private static int countSecond = 0;
	private int studentType;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
		this.college = "Dai Hoc Bach Khoa";
		count++;
	}

	public Student(int id, String name, int studentType) throws Exception {
		if (count > 6) {
			throw new Exception("Can not create more student");
		} else {
			this.id = id;
			this.name = name;
			this.studentType = studentType;
			if (studentType == 1) {
				countPrimary++;
			} else if (studentType == 2) {
				countSecond++;
			}
			count++;
			//System.out.println(count);
		}
	}

	// public static Student createStudentWithLimit(int id, String name, int
	// studentType){
	// if(count < 8){
	// return new Student(id, name, studentType);
	// }
	// else{
	// return new Student(1, "h", 1);
	// }
	// }

	public static int getCountPrimary() {
		return countPrimary;
	}

	public static void setCountPrimary(int countPrimary) {
		Student.countPrimary = countPrimary;
	}

	public static int getCountSecond() {
		return countSecond;
	}

	public static void setCountSecond(int countSecond) {
		Student.countSecond = countSecond;
	}

	public int getStudentType() {
		return studentType;
	}

	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}
	// Question 4
	// public static int getGroupMoney() {
	// return groupMoney;
	// }
	// public static void setGroupMoney(int groupMoney) {
	// this.groupMoney = groupMoney;
	// }

	@Override
	public String toString() {
		return "Student ID : " + id + "\tStudent Name : " + name + "\tCollege : " + college;
	}

}
