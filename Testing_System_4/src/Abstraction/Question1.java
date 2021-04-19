package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		VietnamesePhone demo = new VietnamesePhone();
		demo.setPhoneName("Hoang");
		demo.setPhoneNumber("0362711117");
		Contact contact1 = new Contact("0123456789", "Nam");
		Contact contact2 = new Contact("0987654321", "Thanh");
		Contact contact3 = new Contact("0147852369", "Ngoc");
		Contact contact4 = new Contact("0321654987", "Huyen");
		List<Contact> arr = new ArrayList<Contact>();
		arr.add(contact1);
		arr.add(contact2);
		arr.add(contact3);
		arr.add(contact4);
		demo.setArrayContact(arr);
		System.out.println(demo.toString());
		System.out.println("-------------------------------------------------------------------");
		for(Contact contact : arr){
			System.out.println(contact.toString());
		}
		// Test Insert
		demo.insertContact("Truong", "0369852147");
		System.out.println("-------------------------------------------------------------------");
		for(Contact contact : arr){
			System.out.println(contact.toString());
		}
		// Test Remove
		demo.removeContact("Truong");
		System.out.println("-------------------------------------------------------------------");
		for(Contact contact : arr){
			System.out.println(contact.toString());
		}
		// Test Update
		demo.updateContact("Huyen", "Huyen Update");
		demo.removeContact("Truong");
		System.out.println("-------------------------------------------------------------------");
		for(Contact contact : arr){
			System.out.println(contact.toString());
		}
		// Test search
		System.out.println("-------------------------------------------------------------------");
		demo.searchContact("Ngoc");
		
		

	}

}
