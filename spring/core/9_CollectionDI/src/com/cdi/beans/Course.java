package com.cdi.beans;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Course {
	private List<String> subjects;
	private Set<String> faculties;
	private Properties facultySubjects;
	
	public Course(Set<String> faculties) {
		this.faculties = faculties;
	}
	
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}

	public void setFacultySubjects(Properties facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	public void showSubjects(){
		System.out.println("Subjects :");
		for(String s:subjects ){
			System.out.println(s);
		}
	}
	
	public void showFaculties(){
		System.out.println("Faculties : ");
		for(String f : faculties){
			System.out.println(f);
		}
	}
	
	public void showFacultiesSubjects(){
		System.out.println("Faculty --> Subjects");
		for(Object fs : facultySubjects.keySet()){
			System.out.println(fs+"-->"+facultySubjects.get(fs));
		}
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties
				+ ", facultySubjects=" + facultySubjects + "]";
	}
	
}
