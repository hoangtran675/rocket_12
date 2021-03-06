package com.vti.FacebookDemo.frontend;

import java.util.List;

import com.vti.FacebookDemo.backend.presentationlayer.Controller;
import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;
import com.vti.FacebookDemo.utils.ScannerUtils;

public class Program {
	private static Controller controller;

	public static void main(String[] args) {
		ScannerUtils scanner = new ScannerUtils();
		controller = new Controller();
		// Log In To Facebook
		System.out.println("-------------------------------FACEBOOK-------------------------------\n");
		System.out.println("1: LOG IN\n2: EXIT");
		int logInOrExist = 0;
		do {
			System.out.print("Your decision : ");
			logInOrExist = scanner.inputInt("Wrong input! Please Select 1 or 2 ");
			if (logInOrExist == 2) {
				System.out.println("************ You Selected : EXIT");
				return;
			} else if (logInOrExist == 1) {
				System.out.println("************ You Selectd  : LOG IN ");
			}
		} while ((logInOrExist != 1) && (logInOrExist != 2));
		
		// Using Facebook
		boolean logInCheck = false;
		String username = null;
		String password = null;
		do {
			System.out.print("Input Username : ");
			username = scanner.inputString();
			System.out.print("Input Password : ");
			password = scanner.inputString();
			logInCheck = logIn(username, password);
		} while (logInCheck == false);
		
			int currentId = getId(username, password);
			System.out.println("----------------------FUNCTION----------------------");
			System.out.println(	"1: Show List Of Your Friend "
					+ 			"\n2: Show People Who lately chat with you "
					+ 			"\n3: Show Message Of Your Friend "
					+ 			"\n4: Send Message To Your Friend "
					+ 			"\n5: Send A Request "
					+ 			"\n6: Accept Request "
					+ 			"\n7: Accept All Request "
					+ 			"\n8: Log Out");
			int functionCheck = -1;
			do{
				System.out.print("Your choice : ");
				functionCheck = scanner.inputInt("Number must be integer and from 1 to 8 ");
				switch(functionCheck){
				case 1:
					List<User> friendscase1 = showListFriendById(currentId);
					for (User user : friendscase1) {
						System.out.println(user.toString());
					}
					break;
				case 2:
					System.out.println("You Selected : Show People Who lately chat with you ");
					System.out.print("Input number of result : ");
					int amountfriend = scanner.inputInt("It is not integer number");
					List<User> friendscase2 = AmountUserMessageWith(currentId, amountfriend);
					for (User user : friendscase2) {
						System.out.println(user.toString());
					}
					break;
				case 3:
					System.out.println("You Selected : Show Message Of Your Friend");
					System.out.print("ID Of Your Friend : ");
					int friendId = scanner.inputInt("It is not integer number");
					List<Message> messages = getConversation(currentId, friendId);
					for (Message message : messages) {
						System.out.println(message.toString());
					}
					break;
				case 4:
					System.out.println("You Selected : Send Message ");
					System.out.print("ID Of Your Friend : ");
					int friendIdToChat = scanner.inputInt("It is not integer number");
					System.out.print("Text : ");
					String text = scanner.inputString();
					sendMessage(currentId, friendIdToChat, text);
					break;
				case 5:
					System.out.println("You Selected : Send A Request ");
					System.out.print("ID Of People You Want To Make Friend : ");
					int friendIdToRequest = scanner.inputInt("It is not integer number");
					sendRequest(currentId, friendIdToRequest);
					break;
				case 6:
					System.out.println("You Selected : Accept A Request ");
					System.out.print("ID Of People You Want To Accept : ");
					int friendIdToAccept = scanner.inputInt("It is not integer number");
					acceptRequest(currentId, friendIdToAccept);
					break;
				case 7:
					System.out.println("You Selected : Accept All Request ");
					acceptRequestAll(currentId);
					break;
				case 8:
					System.out.println("You Selected : Log Out ");
					functionCheck = 11;
					break;
				
				}
			}while((functionCheck == 1) || (functionCheck == 2) || (functionCheck == 3) || (functionCheck == 4) || (functionCheck == 5) || (functionCheck == 6) || (functionCheck == 7) || (functionCheck == 8)  );


	}

	public static boolean logIn(String userName, String password) {
		return controller.logIn(userName, password);
	}

	public static List<User> showListFriendById(int id) {
		System.out.println("You Selected : Show List Friend");
		return controller.showListFriendById(id);
	}

	public static List<User> AmountUserMessageWith(int userId, int amount) {
		return controller.AmountUserMessageWith(userId, amount);
	}

	public static List<Message> getConversation(int hostId, int friendId) {
		return controller.getConversation(hostId, friendId);
	}

	public static void sendMessage(int hostId, int friendId, String content) {
		controller.sendMessage(hostId, friendId, content);
	}

	public static void sendRequest(int fromId, int toId) {
		controller.sendRequest(fromId, toId);
	}

	public static void acceptRequest(int fromId, int toId) {
		controller.acceptRequest(fromId, toId);
	}
	public static void acceptRequestAll(int id){
		controller.acceptRequestAll(id);
	}
	public static int getId(String username, String password) {
		return controller.getId(username, password);
	}

}
