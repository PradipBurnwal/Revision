package com.stereotypeAnno4.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Lazy
@Scope("prototype")
public class Toy {

	public Toy() {
		System.out.println("Toy created");
	}
	
	public void play(){
		System.out.println("Playing...");
	}
	
}
