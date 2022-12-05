package com.fullstackjavadeveloper;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] stringArray = {"Anu", "Ammu", "Shailu", "Ravi", "Rohan"};
	
		for(String name : stringArray) {
			System.out.println(name);
		}
		
		/*
		 * for(int i = 0; i <= stringArray.length-1; i ++) {
			System.out.println(stringArray[i]);
		}

		System.out.println(stringArray[1]);*/
	}

}
