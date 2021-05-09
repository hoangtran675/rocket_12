package Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static Scanner scanner = new Scanner(System.in);
	public static List<News> news = new ArrayList<News>();
	public static News newManual = new News();
	public static int a;
	public static int b;
	public static int c;
	
	
	public static void main(String[] args) {
		
		System.out.println("1 : Insert News"
				+ "\n2 : View List News"
				+ "\n3 : Average News"
				+ "\n4 Exit");
		int selectFunction;
		do{
			System.out.println("Chon chuc nang : ");
			selectFunction = scanner.nextInt();
			switch(selectFunction){
			case 1 :
				insertNews();
				break;
			case 2 :
				System.out.println("FUNCTION : Display");
				for(News element : news){
					element.display();
				}
				break;
			case 3 :
				calculation();
				break;
			}
		}while(selectFunction < 4);
		
	}
	public static void insertNews(){
		System.out.println("FUNCTION : Insert News");
		
		System.out.println("Nhap vao Title : ");
		scanner.nextLine();
		String title = scanner.nextLine();
		System.out.println("Nhap vao Publish Date : ");
		String publishDate = scanner.nextLine();
		System.out.println("Nhap vao Author : ");
		String author = scanner.nextLine();
		System.out.println("Nhap vao Content : ");
		String content = scanner.nextLine();
		System.out.println("Nhap vao 3 gia tri diem : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		
		newManual.setAuthor(author);
		newManual.setContent(content);
		newManual.setPublishDate(publishDate);
		newManual.setTitle(title);
		
		news.add(newManual);
		
	}
	public static void calculation(){
		System.out.println("FUNCTION : Calculate");
		newManual.setArray(a,b,c);
		newManual.calculate(a, b, c);
		System.out.println(newManual.getAverageRate());
	}
	
	
	
}
