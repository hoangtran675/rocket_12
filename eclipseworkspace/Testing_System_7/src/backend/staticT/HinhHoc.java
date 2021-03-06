package backend.staticT;

public abstract class HinhHoc {
	private final int SO_LUONG_HINH_HOC_TOI_DA = 5;
	public static int countHinhHoc = 0;
	
	HinhHoc() throws HinhHocException{
		if(countHinhHoc > 4){
			throw new HinhHocException(SO_LUONG_HINH_HOC_TOI_DA);
		}
		
	}
	
	abstract float chuVi();
	abstract float dienTich();
	
	
	public int getSO_LUONG_HINH_HOC_TOI_DA() {
		return SO_LUONG_HINH_HOC_TOI_DA;
	}
	
}
