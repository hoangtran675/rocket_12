package Polymorhphism;

public class HinhChuNhat {
	private int canhDai;
	private int canhRong;
	
	public HinhChuNhat(int canhDai, int canhRong) {
		this.canhDai = canhDai;
		this.canhRong = canhRong;
	}
	public int getCanhDai() {
		return canhDai;
	}
	public void setCanhDai(int canhDai) {
		this.canhDai = canhDai;
	}
	public int getCanhRong() {
		return canhRong;
	}
	public void setCanhRong(int canhRong) {
		this.canhRong = canhRong;
	}
	public void dienTich(){
		System.out.println("Dien tich HCN la : " + (canhDai*canhRong));
	}
	public void chuVi(){
		System.out.println("Chu vi HCN la : " + ((canhDai+canhRong)*2) );
	}
	
	
}
