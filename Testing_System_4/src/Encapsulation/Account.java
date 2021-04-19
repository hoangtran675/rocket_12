package Encapsulation;

public class Account {
	private int id;
	private String name;
	private int balance;
	
	Account(int id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getBalance(){
		return balance;
	}
	
}
