package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.Course;
import com.cdi.beans.University;

public class CDITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		/*Course course = factory.getBean("bTechCS", Course.class);
		course.showSubjects();
		course.showFaculties();
		course.showFacultiesSubjects();*/
		University uni = factory.getBean("uni", University.class);
		uni.showUniversityInfo();
	}

}
