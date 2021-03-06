package entity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	final String fileExisted = "Error ! File Exist";
	final String fileNotExisted = "Error ! File Not Exist";

	public boolean isFileExist(String path) {
		File file = new File(path);
		if (file.exists())
			return true;
		else
			return false;
	}

	public void createNewFile(String path) throws Exception {
		if (isFileExist(path)) {
			throw new Exception(fileExisted);
		} else {
			File file = new File(path);
			if (file.createNewFile()) {
				System.out.println("Create New File Successfully !");
			} else {
				System.out.println("Fail To Create New File !");
			}
		}
	}

	public void deleteFile(String path) throws Exception {
		if (isFileExist(path) == false) {
			throw new Exception(fileNotExisted);
		} else {
			File file = new File(path);
			if (file.delete()) {
				System.out.println("File Is Deleted Successfully");
			} else {
				System.out.println("Fail To Delete File");
			}
		}
	}

	public boolean isFolder(String path) throws Exception {
		if (isFileExist(path)  == false) {
			throw new Exception(fileNotExisted);
		} else {
			File file = new File(path);
			if (file.isDirectory()) {
				return true;
			} else {
				return false;
			}
		}
	}

	// ham chi lay ten file, khong lay ten folder
	public List<String> getAllFileName(String path) throws Exception {
		List<String> listFile = new ArrayList<String>();
		if (isFileExist(path) == false) {
			throw new Exception(fileNotExisted);
		} else {
			File file = new File(path);
			for (File element : file.listFiles()) {
				listFile.add(element.getName());
			}
			return listFile;
		}
	}

	public void copyFile(String sourceName, String destName) throws Exception {
		if (isFileExist(sourceName) == false) {
			throw new Exception("Error! Source File Not Exist");
		} else if (isFileExist(destName)) {
			throw new Exception("Error! newPath has File same name");
		} else {
			File source = new File(sourceName);
			File dest = new File(destName);
			Files.copy(source.toPath(), dest.toPath());

		}
	}

	// copy roi xoa goc
	public void moveFile(String sourceName, String destName) throws Exception {
		if (isFileExist(sourceName) == false) {
			throw new Exception("Error! Source File Not Exist");
		} else {
			File source = new File(sourceName);
			File dest = new File(destName);
			Files.copy(source.toPath(), dest.toPath());
			source.delete();
		}
	}

	// rename file
	public void renameFile(String sourceName, String destName) throws Exception {
		if (isFileExist(sourceName) == false) {
			throw new Exception("Error! Source File Not Exist");
		} else if (isFileExist(destName)) {
			throw new Exception("Error ! Name is exist ");
		} else {
			File source = new File(sourceName);
			File dest = new File(destName);
			source.renameTo(dest);
		}
	}

	public void createNewFolder(String path) throws Exception {
		if (isFileExist(path)) {
			throw new Exception("Name Is Exist");
		} else {
			File file = new File(path);
			if (file.mkdir()) {
				System.out.println("Created A Folder");
			} else {
				System.out.println("Fail To Create A Folder");
			}
		}
	}
	
	public boolean downloadFile(String link, String folderName) throws IOException{
		File folder = new File(link);
		if(folder.exists()){
			System.out.println("Folder is exist !");
			return false;
		}
		String s[] = link.split("/");
		String name = s[s.length - 1];
		folderName = folderName + "/" + name;
		URL url = new URL(link);
		// Create connection to URL
		URLConnection connection = url.openConnection();
		int size = connection.getContentLength();
		InputStream in = connection.getInputStream();
		FileOutputStream out = new FileOutputStream(folderName);
		int byteDownloaded = 0;
		byte[] b = new byte[1024];
		int length = in.read(b);
		while(length != -1){
			byteDownloaded += length;
			System.out.println(byteDownloaded * 100f / size + "%");
			out.write(b, 0, length);
			length = in.read(b);
			
		}
		out.close();
		in.close();
		System.out.println("DOWNLOAD FILE SUCCESSFULLY ");
		return true;
		
	}

}
