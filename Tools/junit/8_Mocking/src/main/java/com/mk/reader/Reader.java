package com.mk.reader;

import java.io.IOException;
import java.util.List;

public interface Reader {
	public List<String> getData(String inFile) throws IOException;

}
