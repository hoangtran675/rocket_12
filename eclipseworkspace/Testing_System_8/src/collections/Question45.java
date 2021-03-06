package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question45 {
	public static void main(String[] args) {
		Set<Student> s = new HashSet<Student>();
		s.add(new Student("Hoang"));	// 5
		s.add(new Student("Hieu"));		// 1
		s.add(new Student("Yen"));	    // 3
		s.add(new Student("Loan"));		// 2
		for (Student student : s) {
			System.out.println(student.toString());
		}
		List<Student> sList = new ArrayList<Student>(s);
		Collections.sort(sList, new CompatatorID());
		System.out.println("Before            ");
		for (Student student : sList) {
			System.out.println(student.toString());
		}
	}
		
	
	
}
