package comparing;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorDate implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int day1 = (int) s1.getDateOfBirth().toEpochDay(); 
		int day2 = (int) s2.getDateOfBirth().toEpochDay();
		if(s1 == null){
			return -1;
		}
		else if(s2 ==  null){
			return 1;
		}else if(day1 > day2) {
			return 1;
		}else if(day1 < day2){
			return -1;
		}
		else{
		return 0;
		}
	}

}
