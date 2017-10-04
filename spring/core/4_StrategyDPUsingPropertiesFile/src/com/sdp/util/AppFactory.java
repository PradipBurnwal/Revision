package com.sdp.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppFactory {
	private static Properties props;
	
	static{
		props = new Properties();
		
		try {
			props.load(AppFactory.class.getClassLoader().getResourceAsStream("com/sdp/common/app-class.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object createObject(String I_clazz) throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		String clazzName = null;
		Object obj = null;
		clazzName = props.getProperty(I_clazz);
		obj = Class.forName(clazzName).newInstance();
		return obj;
	}

}
