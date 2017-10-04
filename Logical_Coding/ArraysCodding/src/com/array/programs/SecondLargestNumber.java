package com.array.programs;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Size of the Array:");
		int size =sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size-1];
		
		int i,largest;
		System.out.println("Please Enter the Elementc:");
		for(i=0;i<size;i++){
			a[i] = sc.nextInt();
		}
		
		largest = a[0];
		for(i=1; i<size; i++){
			if(a[i]>largest){//if a[i] is greater then largest no then first shift the
							//largest no into b[i] then shift a[i] in largest variable name.
				b[i-1] = largest;
				largest = a[i];
			}else {
				//if a[i] is not Greater then largest no then save it in array b[]
				b[i-1] = a[i];
			}
		}
		//Iterate and display array b
		for(i=0; i<size-1;i++){
			System.out.println("b["+i+"] : "+b[i]);
		}
		largest = b[0];
		for(i=1; i<size-1; i++){
			if(b[i]>largest){
				largest = b[i];
			}
		}
		System.out.println("The second largest number is : "+largest);
		
	}

}
