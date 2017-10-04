package com.itc.langPack;

public class Lab011MemoryManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***Main Start***");
		Runtime rt = Runtime.getRuntime();
		System.out.println("T : "+rt.totalMemory());
		System.out.println("M : "+rt.maxMemory()); 		
	}

}
