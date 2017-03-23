/*
 * 
 * This class will illustrate method overloading or static polymorphism  (different data types of parameter list)
 * version
 * 23-03-2017
 */

package com.amar;

public class MethodOverloadingExample3 {

	public float myMethod(float f){
		System.out.println("This method returns float");
		return f;
	}
	public int myMethod(int a){
		System.out.println("This method returns int");
		return a;
	}
	
	public static void main(String[] args) {
		new MethodOverloadingExample3().myMethod(10.35f);

	}

}
