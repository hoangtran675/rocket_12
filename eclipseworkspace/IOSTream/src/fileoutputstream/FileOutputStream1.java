package fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;


// import java.io.FileOutputStream;
public class FileOutputStream1{

	public static void main(String[] args) {
		// C:\Users\Admin\Desktop
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\image.jpg");
			fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\image_new1.jpg");
			int data ;
			while((data = fin.read()) != -1){
				fout.write(data);
			}
			System.out.println("File Coppied");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
