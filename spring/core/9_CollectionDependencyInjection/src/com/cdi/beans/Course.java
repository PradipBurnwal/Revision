package com.cdi.beans;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Set;

public class Course {
	private List<String> subject;
	private Set<String> faculties;

	//@ConstructorProperties(value = { "subject" })
	public Course(List<String> subject) {
		this.subject = subject;
	}
	
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "Course [subject=" + subject + ", faculties=" + faculties + "] list-class:"+subject.getClass().getName()+" set-class:"+faculties.getClass().getName();
	}
	
}
