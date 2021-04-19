import java.util.Comparator;

public class ComparatorName implements Comparator<Department>{

	@Override
	public int compare(Department dept1, Department dept2) {
		// TODO Auto-generated method stub
		if(dept1 == null){
			return -1;
		}
		if(dept2 ==  null){
			return 1;
		}
		return dept1.name.compareTo(dept2.name);
	}

}
