package Polymorhphism;

public class HinhVuong extends HinhChuNhat {

	
	public HinhVuong(int canhDai, int canhRong) {
		super(canhDai, canhRong);
	}
	@Override
	public void dienTich() {
		System.out.println("Dien tich HV la " + (super.getCanhDai() * super.getCanhRong()));
	}
	@Override
	public void chuVi() {
		System.out.println("Chu vi HV la " + (super.getCanhDai() * 4));
	}
	

}
