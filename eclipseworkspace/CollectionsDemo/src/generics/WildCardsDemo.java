package generics;

import java.util.ArrayList;

public class WildCardsDemo {
	public static void main(String[] args) {
		WildCardsDemo a = new WildCardsDemo();
		a.myMethod(new ArrayList<String>() );
	}
public void myMethod(ArrayList<?> l){
	l.add(null);
	l.add("Hoang");
}
}
