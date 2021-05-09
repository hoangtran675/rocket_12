package Polymorhphism;

public class Question1 {

	public static void main(String[] args) {
		// question a
		Student s1 = new Student("Tran Van A", 1);
		Student s2 = new Student("Tran Van B", 2);
		Student s3 = new Student("Tran Van C", 3);
		Student s4 = new Student("Tran Van D", 1);
		Student s5 = new Student("Tran Van E", 2);
		Student s6 = new Student("Tran Van F", 3);
		Student s7 = new Student("Tran Van G", 1);
		Student s8 = new Student("Tran Van H", 2);
		Student s9 = new Student("Tran Van J", 3);
		Student s0 = new Student("Tran Van K", 1);
		Student[] s = {s0, s1, s2, s3, s4,s5,s6,s7,s8,s9};
		// question b
		System.out.println("-----------------------------------------Ca lop diem danh");
		for(Student element : s){
			element.diemDanh();
		}
		// question c
		System.out.println("-----------------------------------------Nhom 1 di hoc bai");
		for(Student element : s){
			if(element.getGroup() == 1){
				element.hocBai();
			}
		}
		// question d
		System.out.println("-----------------------------------------Nhom 2 di don ve sinh");
		for(Student element : s){
			if(element.getGroup() == 2){
				element.donVeSinh();;
			}
		}

	}

}
