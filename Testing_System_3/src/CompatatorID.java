import java.util.Comparator;

public class CompatatorID implements Comparator<Department>{

	@Override
	public int compare(Department dept1, Department dept2) {
		if(dept1 == null){
			return -1;
		}
		if(dept2 == null){
			return 1;
		}
		if(dept1.id < dept2.id){
			return -1;
		} else if(dept1.id > dept2.id){
			return 1;
		}
		return 0;
	}
	

}
