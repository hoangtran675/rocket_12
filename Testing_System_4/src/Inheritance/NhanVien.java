package Inheritance;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, int age, String congViec) {
		super(hoTen, age);
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
