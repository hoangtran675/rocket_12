package lesson8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ListDemo {
//	public static void main(String[] args) {
//		List<Integer> arrList = new ArrayList<Integer>(2);
//		// method : add new implement to List
//		// method : size() : amount of available element
//		arrList.add(5);
//		arrList.add(6);
//		// create new Array : 5,6,0 (newArray.length = 1.5 oldArrayLength)
//		arrList.add(7);
//		// change 0 to 7 => 5,6,7
//		// method : indexOf(index) return value
//		// method : lastIndexOf : duyet phan tu theo chieu nguoc lai cua indexOf
//		arrList.indexOf(5);
//		System.out.println(arrList);
//		Set<Integer> set = new TreeSet<Integer>();
//		set.add(1);
//		set.add(2);
//		set.add(13);
//		set.add(5);
//		set.add(4);
//		set.add(6);
//		set.add(5);
//		set.add(13);
//		for (Integer integer : set) {
//			System.out.println(integer);
//		}
//		
//		
//		Map<String, String> hocViens = new HashMap<String, String>();
//		hocViens.put("Kien", "Macbook");
//		hocViens.put("Chuc", "Dell");
//		hocViens.put("Thuy", "HP");
//		System.out.println(hocViens.get("Thuy"));
//		
//		
//	}
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		Student s1 = new Student("Hoang", 10, 10);
		Student s2 = new Student("Quang", 9, 9);
		Student s3 = new Student("Tai", 10, 14);
		Student s4 = new Student("Kim", 5, 9);
		Student s5 = new Student("Hoang", 6, 15);
		Student s6 = new Student("Hoang", 10, 9);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		Collections.sort(s);
		Collections.reverse(s);
		Collections.sort(s, new SortByAge());
		Collections.sort(s, new SortByMark());
		Collections.sort(s, new SortByAge().thenComparing(new SortByMark()));
		for (Student student : s) {
			System.out.println(student.toString());
		}
	}
	
}
