/*
 * 
 * This class will illustrate method overloading or static polymorphism  (different number of parameter list)
 * version
 * 23-03-2017
 */


package com.amar;

public class MethodOverloadingExample {

	public int myMethod(int a){
		System.out.println("method with single parameter");
		return a;
	}
	public int myMethod(int a, int b){
		System.out.println("method with two parameter");
		return (a + b);
	}
	
	public static void main(String[] args) {
		new MethodOverloadingExample().myMethod(10);

	}

}
