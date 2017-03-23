/*
 * This class illustrates use of array in java using both the for loops (for loop and for-each)
 * 23-03-2017 
 */

package com.amar;
public class ArrayExample {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		//Inserting elements into array 
		for (int i=0;i<intArray.length;i++)
		{
			intArray[i]=i;
		}
		//Find array length 
		System.out.println("The length of the Array is : "+ intArray.length);
		
        //Printing elements using for each loop
		System.out.println("Printing array element using for each loop");
		for (int element:intArray)
		{
			System.out.println(element);
		}
	}

}
