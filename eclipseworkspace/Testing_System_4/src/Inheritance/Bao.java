package Inheritance;

import java.util.Date;

public class Bao extends TaiLieu {
	private Date ngayPhatHanh;
	
	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(String maTaiLieu){
		super(maTaiLieu);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
