package Inheritance;

public class KiSu extends CanBo {
	private String nganhDaoTao;

	public KiSu(String hoTen, int age, String nganhDaoTao) {
		super(hoTen, age);
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
