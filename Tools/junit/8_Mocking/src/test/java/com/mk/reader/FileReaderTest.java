package com.mk.reader;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {
	private final String INPUT_FILE_NM =  "e:\\random.txt";
	private Reader reader;
	private List<String> expectedData;
	
	@Before
	public void prepare() throws IOException{
		FileOutputStream fos = null;
		reader = new FileReaderImpl();
		expectedData = Arrays.asList(new String[]{"malayalam","madam","poster","toy"});
		fos = new FileOutputStream(INPUT_FILE_NM);
		fos.write("malayalam,madam,poster,toy".getBytes());
		fos.close();
	}
	
	@Test
	public void testGetData() throws IOException{
		List<String> actualData = null;
		
		actualData = reader.getData(INPUT_FILE_NM);
		assertEquals(expectedData,actualData);
	}
	
	@After
	public void removeFile(){
		new File(INPUT_FILE_NM).delete();
	}

}