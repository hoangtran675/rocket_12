import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private String firstName;
	private String lastName;
	private Department department;
	private Position position;
	private Group[] groups;
	private Date createDate;
	
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
