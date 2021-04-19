package Inheritance;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNhaXuatBan;
	private int soPhatHanh;
	
	

	public TaiLieu() {
	}
	public TaiLieu(String maTaiLieu){
		this.maTaiLieu = maTaiLieu;
	}
	public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soPhatHanh) {
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soPhatHanh = soPhatHanh;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ma Tai Lieu : " + maTaiLieu + " Ten Nha Xuat Ban : " + tenNhaXuatBan + " So Phat Hanh : " + soPhatHanh;
	}
}
