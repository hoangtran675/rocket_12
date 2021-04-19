package Inheritance;

public class CanBo {
	private String hoTen;
	private int age;
	private Gender gender;
	private String diaChi;
	public CanBo(String hoTen, int age) {
		this.hoTen = hoTen;
		this.age = age;

	}
	@Override
	public String toString() {
		return "Ho Ten :"+hoTen+"      Tuoi : "+age;
	}
	public CanBo() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
