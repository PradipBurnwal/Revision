package com.itcindia.SecondJunitCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TokenReader {
	public List<String> getToken(String inFile) throws IOException{
		StringBuffer buffer = null;
		FileInputStream fis = null;
		int c = 0;
		List<String> token = null;
		
		try{
			buffer = new StringBuffer();
			fis = new FileInputStream(inFile);
			while((c=fis.read())!=-1){
				buffer.append((char)c);
			}
		}finally{
			fis.close();
		}
		String[] splits = buffer.toString().split(",");
		token = Arrays.asList(splits);
		
		return token;
	}

}
