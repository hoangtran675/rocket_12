package comparing;

import java.util.Comparator;

public class ComparatorScore implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1 == null){
			return -1;
		}
		else if(s2 ==  null){
			return 1;
		}else if(s1.getScore() > s2.getScore()) {
			return 1;
		}else if(s1.getScore() < s2.getScore()){
			return -1;
		}
		else{
		return 0;
		}
	}

}
