package Inheritance;

public class CongNhan extends CanBo{
	private byte capBac;

	

	public CongNhan(String hoTen, int age, byte capBac) {
		super(hoTen, age);
		this.capBac = capBac;
	}

	public CongNhan() {
		
	}
	
	public byte getCapBac() {
		return capBac;
	}

	public void setCapBac(byte capBac) {
		this.capBac = capBac;
	}
	
}
