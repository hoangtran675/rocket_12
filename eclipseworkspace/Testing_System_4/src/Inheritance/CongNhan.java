package Inheritance;

public class CongNhan extends CanBo{
	private short capBac;

	

	public CongNhan(String hoTen, int age, Gender gender, String diaChi, short capBac) {
		super(hoTen, age, gender, diaChi);
		this.capBac = capBac;
	}

	public CongNhan() {
		
	}
	
	public short getCapBac() {
		return capBac;
	}

	public void setCapBac(short capBac) {
		this.capBac = capBac;
	}
	
}
