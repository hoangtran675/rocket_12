import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListDemo {
	public static void main(String[] args) {
		Object[] obj = new Object[1000000];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Object();
		}
		ArrayList<Object> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : obj) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("--   " + (end-start));
	}
}
