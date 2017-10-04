package com.mk.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mk.reader.Reader;

public class Palindrome {
	private Reader reader;

	public Palindrome(Reader reader) {
		this.reader = reader;
	}
	
	public List<String> getPalindromes(String inFile) throws IOException{
		boolean flag = true;
		List<String> data = null;
		List<String> palindromes = null;
		
		palindromes = new ArrayList<String>();
		data = reader.getData(inFile);
		for(String s:data){
			flag = true;
			for(int i = 0;i<=(s.length())/2;i++){
				if(s.charAt(i)!=s.charAt((s.length()-1)-i)){
					flag = false;
				}
			}
			if(flag){
				palindromes.add(s);
			}
		}
		return palindromes;
		
	}
}
