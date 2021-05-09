import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) {
//		FileInputStream fis = new FileInputStream(new File("C:/Users/Admin/Desktop/myfile.txt"));
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\myfile.txt");
			System.out.println("File opened");
			int i = 1;
			while( (i = fis.read()) != -1) { // read den -1 la den cuoi  file
				System.out.print((char) i);
				// read() returns the next byte of data
			}
		} catch (FileNotFoundException e) {
			// Exception : File khong tim duoc hoac khong ton tai
			e.printStackTrace();
		} catch (IOException e) {
			// file khong cho phep doc
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// file khong cho phep dong
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
	}

}
