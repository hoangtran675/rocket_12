
public class ComparableID implements Comparable<Department>{

	@Override
	public int compareTo(Department dept) {
		if(dept == null){
			return -1;
		}
		
		return 0;
	}

}
