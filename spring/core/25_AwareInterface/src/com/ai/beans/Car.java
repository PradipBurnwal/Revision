package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware{
	private String beanId;
	private BeanFactory factory;
	public void drive(){
		
		IEngine engine = null;
		
		engine = factory.getBean(beanId, IEngine.class);
		int status = engine.start();
		if(status == 1){
			System.out.println("driving Car");
		} else{
			System.out.println("failed to start car");
		}
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBeanFactory() : AwareInterface");
		this.factory = factory;
	}


	public void setBeanId(String beanId) {
		System.out.println("setBeanId");
		this.beanId = beanId;
	}
	

}
