import java.util.Date;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Date createDate;
	private Account[] accounts;
	private String[] userName;
	
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
