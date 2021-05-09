package lesson8;

import java.util.Comparator;

public class SortByMark implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getMark() > s2.getMark())	return 1;
		else if(s1.getMark() < s2.getMark())	return -1;
		else return 0;
		
	}
	
}
