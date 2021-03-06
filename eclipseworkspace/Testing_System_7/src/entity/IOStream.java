package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
	public void readFile(String path) throws Exception {
		File file = new File(path);
		if (file.exists() == false) {
			throw new Exception("File is not exist");
		} else {
			FileInputStream f = new FileInputStream(path);
			// chia ra doc 1024 byte mot lan
			byte[] b = new byte[1024];
			// voi 1024 byte kia la se doc duoc 1 doan co do dai la length
			int length = f.read(b); // length = -1 khi file khong con data
			while (length > -1) {
				String content = new String(b, 0, length);
				System.out.println(content);
				length = f.read(b);
			}
			f.close();
		}
	}
	public void writeFile(String path, boolean isContinue, String content) throws Exception{
		File file = new File(path);
		if (file.exists() == false) {
			throw new Exception("File is not exist");
		} else {
			FileOutputStream out = new FileOutputStream(path, isContinue);
			out.write(content.getBytes());
			out.close();
		}
		
	}
}
