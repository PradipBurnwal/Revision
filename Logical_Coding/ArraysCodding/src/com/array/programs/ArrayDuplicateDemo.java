package com.array.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateDemo {

	public static void main(String[] args) {
		String[] duplicates = new String[]{"Java","Hibernate","Spring","Java"};
		List duplicatesList = Arrays.asList(duplicates);
		Set duplicatesSet = new HashSet<>(duplicatesList);
		if(duplicatesList.size() != duplicatesSet.size()){
			System.out.println("The Arrays Contains duplicates");
		}else{
			System.out.println("The Arrays Not Contains any duplicates");
		}
	}

}
