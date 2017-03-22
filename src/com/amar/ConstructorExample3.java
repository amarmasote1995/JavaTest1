/*
 * 
 * This example illustrates constructor overloading and constructor chaining
 * 
 */


package com.amar;

class ConstructorOverloading
{
	private int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	ConstructorOverloading()
	{
		System.out.println("0-arg constructor is executed");
		rollNo= 100;
	}
	ConstructorOverloading(int a)
	{
		this();
		/*
		 * this() is used here to call default constructor
		 * from parameterized constructor.
		 */
		rollNo = a;
	}
}

public class ConstructorExample3 {

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		System.out.println(c.getRollNo());
		
		ConstructorOverloading c1 = new ConstructorOverloading(10);
		System.out.println(c1.getRollNo());
	}

}
