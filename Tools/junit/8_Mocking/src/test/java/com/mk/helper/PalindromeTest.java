package com.mk.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/*import org.easymock.EasyMock;*/
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mk.reader.Reader;

public class PalindromeTest {
	private final String INPUT_FILE_NM = "e:\\random.txt";
	private Palindrome palindrome;
	private List<String> expectedData;
	
	@Before
	public void prepare() throws IOException{
		FileOutputStream fos = null;
		Reader reader = null;
		
		expectedData = Arrays.asList(new String[]{"malayalam","madam"});
		
		/*reader = EasyMock.createMock(Reader.class);
		EasyMock.expect(reader.getData(INPUT_FILE_NM)).andReturn(expectedData);
		EasyMock.replay(reader);*/
		
		palindrome = new Palindrome(reader);
		
		fos = new FileOutputStream(INPUT_FILE_NM);
		fos.write("malayalam,madam,poster,toy".getBytes());
		fos.close();
	}
	
	@Test
	public void testGetPalindromes() throws IOException{
		List<String> actualData = null;
		
		actualData = palindrome.getPalindromes(INPUT_FILE_NM);
		Assert.assertEquals(expectedData,actualData);
	}
	
	@After
	public void removeFile(){
		new File(INPUT_FILE_NM).delete();
	}
}
