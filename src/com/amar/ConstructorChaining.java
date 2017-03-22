/*
 * 
 * This class is used to illustrate constructor-chaining
 */


package com.amar;

public class ConstructorChaining {

	ConstructorChaining()
	{
		this(1);
		System.out.println("Default constructor");
	}
	
	ConstructorChaining(int a)
	{
		this("a",10);
		System.out.println("parameterized constructor with one arguement");
	}
	
	ConstructorChaining(String a,int b)
	{
		this("a",101,"c");
		System.out.println("parameterized constructor with two arguement");
	}
	
	ConstructorChaining(String a,int b,String c)
	{
		System.out.println("parameterized constructor with three arguement");
	}
	
	
	
	public static void main(String[] args) {
		
	ConstructorChaining obj = new ConstructorChaining();
	
	}

}
