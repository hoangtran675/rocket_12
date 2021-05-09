package Abstraction;

import java.util.List;

public abstract class Phone {
	private String phoneName;
	private String phoneNumber;
	private List<Contact> arrayContact;
	
	public Phone(){
		
	}
	public Phone(String phoneName, String phoneNumber, List<Contact> arrayContact) {
		this.phoneName = phoneName;
		this.phoneNumber = phoneNumber;
		this.arrayContact = arrayContact;
	}
	public abstract void insertContact(String name, String phoneNumber);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String newName);
	public abstract void searchContact(String name);
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Contact> getArrayContact() {
		return arrayContact;
	}
	public void setArrayContact(List<Contact> arrayContact) {
		this.arrayContact = arrayContact;
	}
//	public void addArrayContact(ArrayContact arr){
//		arrayContact.add(arr);
//	}
	public String toString(){
		return "Phone Name : " + getPhoneName() +
				"\nPhone Number : " + getPhoneNumber();
	}
	

}
