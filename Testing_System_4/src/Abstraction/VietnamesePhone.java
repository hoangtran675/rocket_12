package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class VietnamesePhone extends Phone{

//	private String phoneName;
//	private String phoneNumber;
//	private List<ArrayContact> arrayContact;
// ???????????????????????????????????????????????????????????????????????????????????????????????
//	public static List<ArrayContact> arrList = new ArrayList<ArrayContact>();
//	public static List<Phone> VietnamesePhoneList = new ArrayList<Phone>();
	
	@Override
	public void insertContact(String name, String phoneNumber) {
		Contact arr = new Contact(phoneNumber, name);
		super.getArrayContact().add(arr);
	}

	@Override
	public void removeContact(String name) {
		for (int i = 0; i < super.getArrayContact().size(); i++) {
			if (super.getArrayContact().get(i).getName().equals(name)) {
				super.getArrayContact().remove(i);
			}
		}
	}
	@Override
	public void updateContact(String name, String newName) {
		for(int i = 0; i < super.getArrayContact().size(); i++){
			if(super.getArrayContact().get(i).getName().equals(name)){
				super.getArrayContact().get(i).setName(newName);;
			}
		}
	}
	@Override
	public void searchContact(String name) {
		for(int i = 0; i < super.getArrayContact().size(); i++){
			if(super.getArrayContact().get(i).getName().equals(name)){
				System.out.println(super.getArrayContact().get(i).toString());
			}
		}
		
	}


}
