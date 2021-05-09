package lesson5;
// Phone is a Object, Class : goi la doi tuong
// new Phone() :goi la instance = the hien, thuc the
// 1 abstract class se khong the tao duoc thuc the ( khong the tao duoc instance )
public class User {
	private Phone smartPhone;
	private IPhoneActions iphone;
	
	public static void main(String[] args) {
		User user = new User();
		user.makeACall("0123");
		user.sendMessage("01235", "Tran Van Hoang");
	}
	
	public User(){
		// tao instance van la tao new cua dan xuat
		smartPhone = new Smartphone("SamSung");
		iphone = new Smartphone("iPhone");
	}
	public void makeACall(String phoneNumber){
			iphone.makeCall(phoneNumber);
	}
	public void sendMessage(String phoneNumber, String text){
		iphone.sendMessage(phoneNumber, text);
	}
}
