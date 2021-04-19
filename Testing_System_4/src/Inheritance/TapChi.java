package Inheritance;

import java.util.Date;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private Date ngayThangPhatHanh;
	
	public TapChi(String maTaiLieu) {
		super(maTaiLieu);
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public Date getNgayThangPhatHanh() {
		return ngayThangPhatHanh;
	}

	public void setNgayThangPhatHanh(Date ngayThangPhatHanh) {
		this.ngayThangPhatHanh = ngayThangPhatHanh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
