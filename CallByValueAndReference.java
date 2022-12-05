package com.fullstackjavadeveloper;

public class CallByValueAndReference {

	public static void main(String[] args) {
		String[] names = {"Anu", "Ammu", "Siddu", "Adithya", "Rohan"};
		CallByValueAndReference app = new CallByValueAndReference();
		app.displayNames(names);
		System.out.println("***********");
		System.out.println(names[0]);
	}

	void displayNames(String[] names) {
		names[0] = "Nithya";
		for(String name : names) {
			System.out.println(name);
		}
	}
	
}
