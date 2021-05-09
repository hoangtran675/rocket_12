package backend.staticT;

public class HinhChuNhat extends HinhHoc {
	
	private float chieuDai;
	private float chieuRong;
	
	public HinhChuNhat(float chieuDai, float chieuRong) throws HinhHocException {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		countHinhHoc ++;
	}

	

	

	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	float chuVi() {
		return ((chieuDai + chieuRong) * 2);
	}

	@Override
	float dienTich() {
		return (chieuDai * chieuRong);
	}

}
