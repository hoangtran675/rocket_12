import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(new Integer(0));
	list.add(new Integer(10));
	list.add(new Integer(20));
	list.add(new Integer(30));
	list.add(new Integer(40));
	
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		itr.remove();
	}
	System.out.println("Sau khi remove : "+list);
}
}
