package entity;

import java.util.ArrayList;
import java.util.List;

public class Program {
	// C:\\Users\\Admin\\Desktop\\myfile.txt
	public static void main(String[] args) throws Exception {
		FileManager fileManager = new FileManager();
		System.out.println(fileManager.isFileExist("C:\\Users\\Admin\\Desktop\\myfile.txt"));
//		fileManager.createNewFile("C:\\Users\\Admin\\Desktop\\mynewfile.txt");
//		fileManager.deleteFile("C:\\Users\\Admin\\Desktop\\mynewfile.txt");
//		System.out.println(fileManager.isFolder("C:\\Users\\Admin\\Desktop\\myfile.txt"));
//		List<String> a = new ArrayList<String>();
//		a = fileManager.getAllFileName("C:\\Users\\Admin\\Desktop");
//		for (String string : a) {
//			System.out.println(string);
//		}
//		fileManager.copyFile("C:\\Users\\Admin\\Desktop\\myfile.txt", "C:\\Users\\Admin\\Desktop\\copymyfile.txt");
//		fileManager.renameFile("C:\\Users\\Admin\\Desktop\\myfile.txt", "C:\\Users\\Admin\\Desktop\\copymyfile.txt");
		fileManager.createNewFolder("C:\\Users\\Admin\\Desktop\\HoangFolder");

	}
	

}
