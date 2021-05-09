import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStreamDemo {
	public static void main(String[] args) throws IOException {
		String path = "hello.txt";
		File f = new File(path); // chi co td dong, mo, tao file, khong thay doi
									// nd trong file duoc => mở kết nối tới file
		FileInputStream is = null;
		try {
			is = new FileInputStream(f); // mở luồng đọc tới file
			int c;
			while( (c = is.read()) != -1){  // read trong inputstream đọc từng kí tự 1 và trả về 1 số là dạng int trong ASII hệ Dec
				// -1 là báo hiệu kết thúc file
				System.out.println((char)c);
				System.out.println(c);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not exist");
		}finally{
			//is.close();
			// finally Dùng để đóng các kết nối
			System.out.println("This is finally");
		}
		System.out.println("Hoang");

	}
}
