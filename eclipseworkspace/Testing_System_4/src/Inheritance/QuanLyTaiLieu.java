package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTaiLieu {
	public static Scanner scanner = new Scanner(System.in);
	public static List<TaiLieu> taiLieu = new ArrayList<TaiLieu>(); 
	public static void main(String[] args) {
		TaiLieu a = new TaiLieu("Ma 1", "NXB Kim Dong", 123);
		TaiLieu b = new TaiLieu("Ma 2", "NXB Giao Duc", 456);
		Sach c = new Sach("Sach 1");
		TapChi d = new TapChi("Tap Chi 1");
		Bao e = new Bao("Bao 1");
		
		taiLieu.add(a);
		taiLieu.add(b);
		taiLieu.add(c);
		taiLieu.add(d);
		taiLieu.add(e);
		question4();
	}
	// question 4
	public static void question4(){
		System.out.println("1 : Them tai lieu : Sach, Tap chi, Bao"
				+ "\n2 : Xoa tai lieu theo ma tai lieu"
				+ "\n3 : Hien thi thong tin ve tai lieu"
				+ "\n4 : Tim kiem tai lieu theo loai : Sach, bao , tai lieu "
				+ "\n5 : Thoat khoi chuong trinh");
		int num = 0;
		do{
			System.out.println("Nhap vao mot so : ");
			num = scanner.nextInt(6);
			switch(num){
			case 1: 
				themTaiLieu();
				break;
			case 2:
				xoaTaiLieu();
				break;
			case 3:
				thongTinTaiLieu();
				break;
			case 4:
				timKiemTaiLieu();
				break;
			case 5:
				System.out.println("Ban vua chon : Thoat khoi chuong trinh !");
				break;
			}
			
		}while(num < 5);
		scanner.close();
	}
	
	public static void themTaiLieu(){
		System.out.println("FUNCTION : Them tai lieu : Sach, Tap chi, Bao!");
		TaiLieu taiLieu1 = new TaiLieu();
		taiLieu.add(taiLieu1);
		System.out.println("--------------------Done : Them Tai Lieu");
	}
	
	public static void xoaTaiLieu(){
		System.out.println("FUNCTION : Xoa tai lieu theo ma tai lieu!");
		System.out.println("NHAP VAO MA TAI LIEU :");
		scanner.nextLine();
		String s = scanner.nextLine();
		for(int i = 0; i < taiLieu.size(); i++){
			if(s.equals(taiLieu.get(i).getMaTaiLieu())){
				taiLieu.remove(i);
			}
		}
		System.out.println("--------------------Done : Xoa Mot Tai Lieu");
	}
	public static void thongTinTaiLieu(){
		System.out.println("FUNCTION : Hien thi thong tin ve tai lieu !");
		for(TaiLieu element : taiLieu){
			System.out.println(element.toString());
		}
	}
	
	public static void timKiemTaiLieu(){
		System.out.println("FUNCTION : Tim kiem tai lieu theo loai : Sach, bao , tai lieu !");
		System.out.println("1 : Sach"
				+ "\n2 : Tap Chi"
				+ "\n3 : Bao");
//		scanner.nextLine();
		int loaiTaiLieu = scanner.nextInt();
		if(loaiTaiLieu == 1){
			for(TaiLieu element : taiLieu){
				if(element instanceof Sach){
					System.out.println(element.toString());
				}
			}
			System.out.println("--------------------Done : Tim cac Sach");
		}else if(loaiTaiLieu == 3){
			for(TaiLieu element : taiLieu){
				if(element instanceof Bao){
					System.out.println(element.toString());
				}
			}
			System.out.println("--------------------Done : Tim cac bao");
		}else if(loaiTaiLieu == 2){
			for(TaiLieu element : taiLieu){
				if(element instanceof TapChi){
					System.out.println(element.toString());
				}
			System.out.println("--------------------Done : Tim cac tap chi");
			}
		}else{
			System.out.println("Nothing");
		}
	}
	

}
