import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student>{

	
	@Override
	public int compare(Student s1, Student s2) {
		if(s1 ==  null){
			return -1;
		}
		if(s2 == null){
			return 1;
		}
		
		return s1.tenCuoi().compareTo(s2.tenCuoi());
	}

}
