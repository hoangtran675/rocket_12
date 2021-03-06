package collections;

import java.util.Set;

import javax.crypto.SealedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Question3 {
	public static Set<Student> s = new HashSet<Student>();

	public static void main(String[] args) {

		s.add(new Student("Hoang"));	// 4
		s.add(new Student("Hoang"));	// 5
		s.add(new Student("Hieu"));		// 1
		s.add(new Student("Yen"));		// 6
		s.add(new Student("Hoang"));	// 3
		s.add(new Student("Loan"));		// 2
		
		// a ) so phan tu cua list
		System.out.println("The number of element in the list : " + s.size());
		// b ) phan tu thu 4
		System.out.println("---------------------");
		displayHashSet(0);
		displayHashSet( (s.size() -1) );
	}

	// b ) In ra phan tu thu i
	public static void displayHashSet(int i) {
		//Iterator itr = s.iterator();
		//System.out.println("HashSet Student : \n" + s);
		int indexHashSet = 0;
		for (Student student : s) {
			if(indexHashSet == i){
				System.out.println("Element at index "+i+" : \n" + student.toString());
				break;
			}
			indexHashSet++;
		}
	}
	//

}
