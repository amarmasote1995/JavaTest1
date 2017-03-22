/*
 * HelloFromOtherClass
 * 22-03-2017
 * Printing Hello from other class
 */



package com.amar;


class WelcomeMessage
{
	void printMessage()
	{
		System.out.println("Hello");
	}
}

public class HelloFromOtherClass {

	public static void main(String[] args) {
		
		WelcomeMessage welcomeApp = new WelcomeMessage();
        welcomeApp.printMessage();
		
	}

}
