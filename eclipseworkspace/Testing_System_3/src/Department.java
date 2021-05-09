
public class Department implements Comparable<Department>{  // dong nay hieu la so sanh Department voi Department
	int id;
	String name;
	@Override
	public String toString() {
		return "id cua department : " + id + "   name cua department : " + name;
	}
	
	public Department() {
		super();
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Department(int id) {
		this.id = id;
	}

	public Department(String name) {
		
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Department dept = (Department) obj;
		if(obj == null){
			return false;
		}
		else if(name.equals(dept.name)){
			return true;
		}
		return false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Department dept) {
		if(dept == null){
			return -1;
		}
		if(id < dept.id){
			return -1;
		} else if(id > dept.id){
			return 1;
		}
		return 0;
	}
	
}
