package Inheritance;

public class KiSu extends CanBo {
	private String nganhDaoTao;

	

	public KiSu(String hoTen, int age, Gender gender, String diaChi, String nganhDaoTao) {
		super(hoTen, age, gender, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public KiSu() {
		
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	
}
