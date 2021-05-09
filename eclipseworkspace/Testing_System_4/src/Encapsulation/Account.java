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
	public void credit(int amount){
		System.out.println("Credit is : " + amount);
	}
	public void debit(int amount){
		System.out.println("Debit is : " + amount);
	}
	public void transferTo(Account acc, int amount){
		
	}
	
}
