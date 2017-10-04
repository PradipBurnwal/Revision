package com.itc.langPack;

public class lab004toString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student(400, 985632569);
		System.out.println(st1);
		System.out.println("****Default Implementation****");
		String cname = st1.getClass().getName();
		int hc = st1.hashCode();
		String hx = Integer.toHexString(hc);
		String msg = cname+"@"+hx;
		System.out.println(msg);
	}

}
