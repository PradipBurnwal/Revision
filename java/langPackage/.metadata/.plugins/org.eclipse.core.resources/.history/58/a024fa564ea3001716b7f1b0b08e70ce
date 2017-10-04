package com.itc.langStringPack;

public class Lab003Intern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "ITC";
		String str2 = new String("ITC");
		String str3 = str2.intern(); //intern -> return reference from constant pool
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str3);
		System.out.println();
		String str4 = "OK".intern();
		String str5 = "Ok";
		System.out.println(str4 == str5);
		System.out.println("str1-"+str1.hashCode());
		System.out.println("str2-"+str2.hashCode());
		System.out.println("str3-"+str3.hashCode());
		System.out.println("str4-"+str4.hashCode());
		System.out.println("str5-"+str5.hashCode());
	}

}
