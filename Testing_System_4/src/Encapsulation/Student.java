package Encapsulation;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private int mark;
	
	public Student(String name, String homeTown){
		this.name = name;
		this.homeTown = homeTown;
		this.mark = 0;
	}
	
	public void setMark(int mark){
		this.mark = mark;
	}
	public void plusMark(int markBonus){
		this.mark = this.mark + markBonus;
	}
	public String toString(){
		String levelStudy = "Yeu";
		if(mark >= 4 && mark < 6){
			levelStudy = "Trung binh";
		}else if(mark >= 6 && mark < 8){
			levelStudy = "Kha";
		}else if(mark >= 8){
			levelStudy = "Gioi";
		}
		return "Ten hoc sinh : "+ name +"     Hoc luc : " + levelStudy;
	}
	
}
