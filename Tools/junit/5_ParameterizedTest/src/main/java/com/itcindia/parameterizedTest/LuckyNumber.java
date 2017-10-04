package com.itcindia.parameterizedTest;

public class LuckyNumber {
	public int getLuckyNumber(int no){
		int n = 0;
		int luckeyNumber = 0;
		
		while(no>0){
			n = no%10;
			luckeyNumber+=n;
			no = no/10;
		}
		return luckeyNumber;
		
	}
}
