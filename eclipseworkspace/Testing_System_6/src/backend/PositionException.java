package backend;

public class PositionException {
	private int id;
	private String name;
	
	public PositionException(){
		id = ScannerUtils.inputInt("This is not a Integer number !");
		name = ScannerUtils.inputString();
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
	public String toString(){
		return "Position ID : " + id +
				"\nPosition Name : " + name ;
	}
	
}
