package entity;

import utils.ScannerUtils;

public class Account {
	private String name;
	private long stk;
	private double cash;
	private final double MONTH_RATE = 0.25f;
	
	public Account() {
	}

	public Account(String name, long stk, double cash) {
		this.name = name;
		this.stk = stk;
		this.cash = cash;
	}

	
	public Account(String name, long stk) {
		this.name = name;
		this.stk = stk;
		this.cash = 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStk() {
		return stk;
	}

	public void setStk(long stk) {
		this.stk = stk;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", stk=" + stk + ", cash=" + cash + "]";
	} 
	
	public void withdrawCash(){
		ScannerUtils scanner = new ScannerUtils();
		float money = -1f;
		do{
			System.out.print("Input money to withdraw : ");
			scanner.inputFloat("It is not a float number !");
		}while(money <= 0);
		
		money = scanner.inputFloat("It is not a float number !");
		
		cash = cash + money;
	}
	
	
	
	
}
