package entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) throws IOException {
		ScannerUtils in = new ScannerUtils();
//		Student s1 = new Student(in.inputInt("Khong phai la so INT"), in.inputString());
//		Student s2 = new Student(in.inputInt("Khong phai la so INT"), in.inputString());
//		Student s3 = new Student(in.inputInt("Khong phai la so INT"), in.inputString());
		
		List<Student> s = new ArrayList<Student>();
		System.out.println("Nhap vao thong tin hoc sinh thu nhat : ");
		s.add(new Student(in.inputInt("Khong phai la so INT"), in.inputString()));
		System.out.println("Nhap vao thong tin hoc sinh thu hai : ");
		s.add(new Student(in.inputInt("Khong phai la so INT"), in.inputString()));
		System.out.println("Nhap vao thong tin hoc sinh thu ba : ");
		s.add(new Student(in.inputInt("Khong phai la so INT"), in.inputString()));
		
		String[] str = new String[s.size()];
		for(int i = 0; i < s.size(); i++){
			str[i] = "Student " + (i+1) + s.get(i).toString();
		}
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Admin\\Desktop\\StudentInformation.txt", false);
		for(int i = 0; i < str.length; i++){
			fileOut.write((str[i] + "\n").getBytes());
		}
		
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Admin\\Desktop\\StudentInformation.txt");
		byte[] b = new byte[1024];
		int length = fileIn.read(b);
		String content = "";
		while(length > -1){
			content = content + new String(b, 0, length);
			length = fileIn.read(b);
		}
		System.out.println(content);
		fileIn.close();
		fileOut.close();
		
		
		
	}

}
