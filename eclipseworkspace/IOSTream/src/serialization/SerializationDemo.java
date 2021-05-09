package serialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fin;
		ObjectOutputStream occ;
		try {
			fin = new FileOutputStream("C:\\Users\\Admin\\Desktop\\myfile.ser");
			occ = new ObjectOutputStream(fin);
			Account acc = new Account(1,"Hoang", 1000.5f, 123);
			occ.writeObject(acc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
