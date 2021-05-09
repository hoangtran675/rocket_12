package generics;

public class MyGenericClass<T> {
	T obj;

	MyGenericClass(T obj) {
		this.obj = obj;
	}

	public void displayObjectType() {
		System.out.println("Type of object : " + obj.getClass().getName());
	}
	public T getObject(){
		return obj;
	}

}
