package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Animal a = new Cat();
		Animal c = new Cat();
		Animal b = new Bird();
//		a.move();
//		b.move();
		List<Animal> animal = new ArrayList<Animal>();
		animal.add(a);
		animal.add(b);
		animal.add(c);
		for(Animal element  : animal){
			if(element instanceof Cat){
				element.move();
			}
		}
	}

}
