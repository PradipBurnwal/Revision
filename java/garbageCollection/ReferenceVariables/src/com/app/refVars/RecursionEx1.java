package com.app.refVars;

public class RecursionEx1 {
	static {
		System.out.println("SB start");
		RecursionEx1 re1 = new RecursionEx1();
		System.out.println("SB end");
	}
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}

	public RecursionEx1() {
		System.out.println("Constructor start");
		System.out.println("Constructor end");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main end");
	}

}