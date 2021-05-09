package lesson5;

// Lop truu tuong
public abstract class Phone {
	private String brand;
	
	public Phone(String brand){
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public abstract void call(String phoneNumber);
}
