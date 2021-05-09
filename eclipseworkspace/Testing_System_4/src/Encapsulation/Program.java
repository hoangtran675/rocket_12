package Encapsulation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Hoang", "Hai Phong");
		Student s2 = new Student("Yen", "Nam Dinh");
		Student s3 = new Student("Hoan", "Hai Duong");
		Student s4 = new Student("Duy", "Nam Dinh");
		s1.setMark(4);  // s1 = 4 
		s2.plusMark(8); // s2 = 8
		s3.setMark(5); //
		s3.plusMark(2);// s3 = 7 
		s4.plusMark(3);  // s4 = 3
		Student[] s = {s1,s2,s3,s4};
		for(Student element : s){
			System.out.println(element.toString());
		}

	}

}
