package com.mk.reader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MockFileReaderImpl implements Reader{

	public List<String> getData(String inFile) throws IOException {
		return Arrays.asList(new String[]{"malayalam","madam"});
	}

}
