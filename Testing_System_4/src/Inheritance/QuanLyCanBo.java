package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {

	public static List<CanBo> canBo = new ArrayList<CanBo>();
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		CanBo canBo1 = new CanBo("Tran van hoang", 20);
		canBo.add(canBo1);
		CanBo canBo2 = new CanBo("Dinh thi yen", 25);
		canBo.add(canBo2);
		question2();
	}
	// Question2
	public static void question2(){
		System.out.println("1 : Them can bo moi\n2 : Tim kiem theo ho ten\n3 : Hien thi thong tin ve danh sach cac can bo"
				+ "\n4 : Nhap vao ten can bo va xoa can bo do"
				+ "\n5 : Thoat khoi chuong trinh");
		
		int num = 0;
		do{
			System.out.println("NHAP SO CHO CHUC NANG : ");
			num = scanner.nextInt();
			
			switch(num){
			case 1 : 
				themCanBoMoi();
				break;
			case 2:
				timKiemCanBo();
				break;
			case 3:
				hienThiThongTinCanBo();
				break;
			case 4:
				xoaCanBoTheoTen();
				break;
			case 5:
				System.out.println("---------------FUNCTION : Ban vua chon thoat khoi chuong trinh !");
				break;
			}
			
		}while(num < 5);
		scanner.close();
		
	}
	public static void themCanBoMoi(){
		System.out.println("FUNCTION : Ban vua chon them mot can bo !");
		System.out.println("1 : Cong nhan"
				+ "\n2 : Ky su"
				+ "\n3 : Nhan vien");
		int checkNum = 0;
		do{
			System.out.println("NHAP SO THEM CAN BO: ");
			checkNum = scanner.nextInt();
			if(checkNum == 1){
				CongNhan congNhan = new CongNhan();
				canBo.add((CanBo)congNhan);
				System.out.println("====================> Done : Them Cong Nhan");
			}
			else if(checkNum == 2){
				KiSu kiSu = new KiSu();
				canBo.add((CanBo)kiSu);
				System.out.println("====================>Done : Them Ky Su");
			}
			else if(checkNum == 3){
				NhanVien nhanVien = new NhanVien();
				canBo.add((CanBo)nhanVien);
				System.out.println("====================>Done : Them Nhan Vien");
			}
		}while(checkNum > 0 && checkNum < 4);
		
	}
	public static void timKiemCanBo(){
		System.out.println("---------------FUNCTION : Ban vua chon tim kiem can bo theo ten !");
		System.out.println("Nhap vao ten");
		scanner.nextLine();
		String tenCanBo = scanner.nextLine();
		
		boolean hasOrNot = false;
		for(int i = 0; i < canBo.size() ; i++){
			if(tenCanBo.equals(canBo.get(i).getHoTen())){
				System.out.println(canBo.get(i).toString());
				hasOrNot = true;
			}
		}
		if(hasOrNot == false){
			System.out.println("Khong co can bo nao !");
		}
	}
	public static void hienThiThongTinCanBo(){
		System.out.println("---------------FUNCTION : Ban vua chon hien thi thong tin can bo! ");
		for(CanBo element : canBo){
			System.out.println(element.toString());
		}
	}
	public static void xoaCanBoTheoTen(){
		System.out.println("---------------FUNCTION : Ban vua chon nhan ten va xoa can bo theo ten !");
		System.out.println("Nhap vao ten");
		scanner.nextLine();
		String tenCanBo = scanner.nextLine();
		boolean checkXoaCanBo = false;
		for(int i = 0; i < canBo.size() ; i++){
			if(tenCanBo.equals(canBo.get(i).getHoTen())){
				canBo.remove(i);
				checkXoaCanBo = true;
			}
		}
		if(checkXoaCanBo == true){
			System.out.println("Done : Da xoa can bo");
		}else{
			System.out.println("Khong Co Ten Can Bo");
		}
		
	}
	

}
