package Inheritance;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, int age, Gender gender, String diaChi, String congViec) {
		super(hoTen, age, gender, diaChi);
		this.congViec = congViec;
	}

	public NhanVien() {
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	
}
