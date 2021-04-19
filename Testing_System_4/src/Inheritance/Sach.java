package Inheritance;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	
	public Sach(String maTaiLieu) {
		super(maTaiLieu);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public String getTenTacGia(){
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia){
		this.tenTacGia = tenTacGia;
	}
}
