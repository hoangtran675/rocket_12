package fileoutputstream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReaderAndWriter {

	public static void main(String[] args)  {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Users\\Admin\\Desktop\\myfile.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			fw = new FileWriter("C:\\Users\\Admin\\Desktop\\myfile_new.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int ch;
		try {
			while( (ch = fr.read()) != -1){
				fw.write(ch);
			}
			System.out.println("Copy is done");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
