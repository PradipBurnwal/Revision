package com.cdi.beans;

import java.util.Map;

public class University {
	private Map<String, Course> facultyCourseMap;

	public void setFacultyCourseMap(Map<String, Course> facultyCourseMap) {
		this.facultyCourseMap = facultyCourseMap;
	}
	
	public void showUniversityInfo(){
		System.out.println("University courses : ");
		for(String f : facultyCourseMap.keySet()){
			System.out.println("********Course Info********");
			Course c = facultyCourseMap.get(f);
			System.out.println(f+"..."+c);
			System.out.println();
			c.showSubjects();
			c.showFaculties();
			c.showFacultiesSubjects();
		}
	}
}
