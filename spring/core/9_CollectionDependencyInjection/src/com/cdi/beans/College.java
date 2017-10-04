package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class College {
	private Map<String,Course> hodToCourse;
	private Properties courseTopper;
	public Map<String, Course> getHodToCourse() {
		return hodToCourse;
	}
	public void setHodToCourse(Map<String, Course> hodToCourse) {
		this.hodToCourse = hodToCourse;
	}
	public Properties getCourseTopper() {
		return courseTopper;
	}
	public void setCourseTopper(Properties courseTopper) {
		this.courseTopper = courseTopper;
	}
	@Override
	public String toString() {
		return "Collage [hodToCourse=" + hodToCourse + ", courseTopper="
				+ courseTopper + "]";
	}
	
}
