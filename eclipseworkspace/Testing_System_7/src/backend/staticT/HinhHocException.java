package backend.staticT;

public class HinhHocException extends Exception {
	HinhHocException(int soHinhDaGiac) {
		super("SO GIAC HINH DA GIAC : " + soHinhDaGiac);
	}
}
