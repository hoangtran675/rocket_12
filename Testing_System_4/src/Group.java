import java.util.Date;

public class Group {
	int id;
	String name;
	Account creator;
	Date createDate;
	Account[] accounts;
	String[] userName;
	public Group() {
	}
	public Group(String name, Account creator, Date createDate, Account[] accounts) {
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	public Group(String name, Account creator, Date createDate, String[] userName) {
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.userName = userName;
	}
}
