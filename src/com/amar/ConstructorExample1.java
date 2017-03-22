/*
 * ConstructorExample1
 * 22-03-2017
 * This is to illustrate constructor 
 */


package com.amar;

public class ConstructorExample1 {

	private int var;
	public static void main(String[] args) {
		
		 new ConstructorExample1().getValue();
		 new ConstructorExample1(20).getValue();
	}

	ConstructorExample1()
	{
		var=10;
		System.out.println("This is 0-arg constructor");
	}

	 ConstructorExample1(int a)
	{
		var=a;
		System.out.println("This is 1-arg constructor");
	}
	 
	 void getValue ()
	 {
		 System.out.println(var);
		 return ;
	 }

}


