package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\myfile.ser");
			ObjectInputStream ois = new ObjectInputStream(fin); // bien ois se
																// doc tu fin
			// doc tu fin va gan cho obj
			try {
				Object obj = ois.readObject();
				// ep kieu
				Account acc = (Account) obj;
				System.out.println(acc.id);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
