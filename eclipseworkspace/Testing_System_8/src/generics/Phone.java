package generics;

public class Phone<K,V> extends MyMap<K,V>{

	public Phone(K id, V name) {
		super(id, name);
	}
	public K getKey(){
		return super.getKey();
	}
	public V getPhoneNumber(){
		return super.getValue();
	}

}
