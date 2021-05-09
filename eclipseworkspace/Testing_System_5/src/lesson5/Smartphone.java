package lesson5;

// Lop dan xuat,hoac la lop con cua lop Phone, dung de trien khai cac method truu tuong cua lop abstract cha
public class Smartphone extends Phone implements IPhoneActions , IPhone2 {

	public Smartphone(String brand) {
		super(brand);
	}

	@Override
	public void call(String phoneNumber) {
		System.out.println("Making a call from " + getBrand() + " phone to " + phoneNumber);
	}

	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Making a call from " + getBrand() + " phone to " + phoneNumber + " by Interface" );
	}

	@Override
	public void sendMessage(String phoneNumber, String text) {
		System.out.println("Sending Message From "+ getBrand() + " phone to "+ phoneNumber + " with text : \"" + text +"\"");
	}

}
