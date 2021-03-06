package backend.staticT;

public class HinhTron extends HinhHoc{
	private float banKinh;
	private final float PI = 3.1415f;
	
	public HinhTron(float banKinh) throws HinhHocException {
		super();
		this.banKinh = banKinh;
		countHinhHoc ++;
		
	}
	@Override
	float chuVi() {
		return 2*PI*banKinh;
	}
	@Override
	float dienTich() {
		return PI*banKinh*banKinh;
	}
	
}
