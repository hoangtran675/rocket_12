package Abstraction;

public class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private byte mucUuTien;
	private String khoiThi;
//	private String monThi1;
//	private String monThi2;
//	private String monThi3;
	
	
	
	public ThiSinh(){
		
	}
	public ThiSinh(int soBaoDanh, String hoTen,String diaChi, byte mucUuTien, String khoiThi) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoiThi = khoiThi;
		
	}
//	public String getMonThi1() {
//		return monThi1;
//	}
//	public void setMonThi1(String monThi1) {
//		this.monThi1 = monThi1;
//	}
//	public String getMonThi2() {
//		return monThi2;
//	}
//	public void setMonThi2(String monThi2) {
//		this.monThi2 = monThi2;
//	}
//	public String getMonThi3() {
//		return monThi3;
//	}
//	public void setMonThi3(String monThi3) {
//		this.monThi3 = monThi3;
//	}
	public int getSoBaoDanh() {
		return soBaoDanh;
	}
	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}
	public String getKhoiThi() {
		return khoiThi;
	}
	public void setKhoiThi(String khoiThi) {
		this.khoiThi = khoiThi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public byte getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(byte mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	@Override
	public String toString() {
		return "SBD : " + soBaoDanh + 
				"\nHo Ten : " + hoTen + 
				"\nDia Chi : " + diaChi + 
				"\nMuc Uu Tien : " + mucUuTien + 
				"\nKhoi Thi : " + khoiThi;
	}
}
