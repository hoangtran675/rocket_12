package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		System.out.println("before");
		System.out.println(organizer.getId());
		organizer.name = "Apple Inc";
		System.out.println("after");
		
//		Event event = new Event(456l, "Iphone 100 launch", "Grand launch" );
		
		
		
	}
}
