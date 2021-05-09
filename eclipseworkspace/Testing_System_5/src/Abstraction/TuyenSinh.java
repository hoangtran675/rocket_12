package Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
	public static List<ThiSinh> thiSinh = new ArrayList<ThiSinh>();
	public static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
	
	int functionNum;
	
	System.out.println("1 : Them moi thi sinh"
			+ "\n2 : Hien thi thong tin va khoi thi cua thi sinh"
			+ "\n3 : Tim kiem theo SBD"
			+ "\n4 : Thoat khoi chuong trinh");
		do{
			System.out.print("Nhap mot so de chon chuc nang : ");
			functionNum = src.nextInt();
			switch(functionNum){
			case 1 :
				themThiSinhMoi();
				break;
			case 2 :
				hienThiThongTin();
				break;
			case 3 :
				timKiemTheoSBD();
				break;
			}
		}while( functionNum < 4);
	}
	
	public static void themThiSinhMoi(){
		System.out.println("--------------------------------CHUC NANG : THEM MOI THI SINH--------------------------------");
		System.out.print("Nhap vao SBD : ");
		int sbd = src.nextInt();
		
		System.out.print("Nhap vao Ho Ten : ");
		String hoTen = src.nextLine();
		
		System.out.print("Nhap vao Dia Chi : ");
		String diaChi = src.nextLine();
		
		System.out.println("Nhap vao Muc Uu Tien");
		String mucUuTien = src.nextLine(); 
		
		System.out.print("Nhap vao Khoi Thi : ");
		String khoiThi = src.nextLine();
		
		

		System.out.println("---------------------HOAN THANH : THEM MOI THI SINH ");
	}
	public static void hienThiThongTin(){
		System.out.println("--------------------------------CHUC NANG : HIEN THI THONG TIN THI SINH--------------------------------");
		System.out.println(thiSinh.get(0).toString());
	}
	public static void timKiemTheoSBD(){
		System.out.println("--------------------------------CHUC NANG : TIM KIEM THEO SDB--------------------------------");
		System.out.print("Nhap vao SBD : ");
		int sbd = src.nextInt();
		for(ThiSinh element : thiSinh){
			if(element.getSoBaoDanh() == sbd){
				System.out.println(element.toString());
			}
		}
	}
}
