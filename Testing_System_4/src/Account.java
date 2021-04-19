import java.util.Date;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	String firstName;
	String lastName;
	Department department;
	Position position;
	Group[] groups;
	Date createDate;
	
	// Question 2 .a
	public Account() {
	}
	// Question 2 . b
	public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + lastName;
	}
	// Question 2 .c 
	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.createDate = new Date();
		this.fullName = firstName + lastName;
	}
	// Question 2. d
	public Account(int id, String email, String userName, String firstName, String lastName, Position position,
			Date createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.createDate = createDate;
	}
	
	
	
	
}
