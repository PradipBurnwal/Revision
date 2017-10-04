package com.bpp.util;

import java.util.concurrent.atomic.AtomicInteger;

public class BeanStatistics {
	private static AtomicInteger instance = new AtomicInteger(0);
	
	public static void increment(){
		instance.incrementAndGet();
	}
	public static int getInstance(){
		return instance.get();
	}
}
