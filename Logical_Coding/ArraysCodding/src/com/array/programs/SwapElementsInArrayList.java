package com.array.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapElementsInArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		System.out.println("Element Before Swapping : "+list);
		Collections.swap(list, 1, 2);
		Collections.swap(list, 3, 4);
		System.out.println("Element After Swapping : "+list);
		Collections.reverse(list);
		System.out.println("Element After Reversing : "+list);
	}

}
