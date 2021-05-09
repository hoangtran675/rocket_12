package generics;

public class MyMap <K,V>{
	private K id;
	private V name;
	
	public MyMap(K id, V name) {
		this.id = id;
		this.name = name;
	}
	public K getKey() {
		return id;
	}
	public void setId(K id) {
		this.id = id;
	}
	public V getValue() {
		return name;
	}
	public void setName(V name) {
		this.name = name;
	}
	
	

}
