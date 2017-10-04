package com.sfmi.beans;

import java.util.Calendar;
import java.util.Date;

public class Reminder {
	
	private String event;
	private Calendar eventDate;
	
	public void setEvent(String event) {
		this.event = event;
	}
	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}
	
	public String getReminder() {
		return "Reminder [event=" + event + ", eventDate=" +new Date(eventDate.getTimeInMillis())+ "]";
	}
	
}
