
public class Dog {
//	String	name;
	int		doDaiChan;
	int		doRongMom;
	float thoiGianAn(String thucAn, int doDaiThucAn){
		float tocDoAn;
		if(thucAn.equals("Banh Mi")){
			 tocDoAn = 0.2f;
		}
		else {
			 tocDoAn = 0.5f;
		}
		float a = (doDaiThucAn/tocDoAn);
		return  a;
	}
}
