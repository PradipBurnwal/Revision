package com.mk.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileReaderImpl implements Reader{

	public List<String> getData(String inFile) throws IOException {
		StringBuffer buffer = null;
		FileInputStream fis = null;
		int c = 0;
		
		try{
			buffer = new StringBuffer();
			fis = new FileInputStream(inFile);
			while((c=fis.read())!=-1){
				buffer.append((char)c);
			}
		}finally{
			fis.close();
		}
		
		return Arrays.asList(buffer.toString().split(","));
	}

}