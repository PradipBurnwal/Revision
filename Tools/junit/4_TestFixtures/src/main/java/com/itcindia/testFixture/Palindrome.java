package com.itcindia.testFixture;

public class Palindrome {
	public boolean check(String s){
		boolean flag = true;
		
		for(int i = 0; i<=(s.length()/2);i++){
			if(s.charAt(i)!=s.charAt((s.length()-1)-i)){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
