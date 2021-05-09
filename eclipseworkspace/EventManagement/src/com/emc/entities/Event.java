package com.emc.entities;

import java.util.Date;

public class Event {
	public Long id;
	public String name;
	public String description;
	public Date startTime;
	public Date endTime;
	public boolean started;
	
	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
}
