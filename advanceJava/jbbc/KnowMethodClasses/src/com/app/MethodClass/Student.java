package com.app.MethodClass;

import java.lang.reflect.Method;

public class Student {
	public String getName()
	{
		return null;
	}
	public int getMarks()
	{
		return 100;
	}
	public class Test {
		public static void main(String[] args) {
			int count = 0;
			Class c = Class.forName(Student);
			Method[] m = c.getDeclaredMethods();
			for(Method m1:m)
			{
				count++;
				System.out.println(m1.getName());
			}
			System.out.println("The no, of methods"+count);
		}
	}
}
