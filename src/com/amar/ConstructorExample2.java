/*
 * 22-03-2017
 * Version
 * This class will illustrate how to use this variable in constructor to initialize objects.
 */


package com.amar;


 class Student
{
	private String stuId;
	private String stuName;
	private int stuAge;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	Student()
	{
		System.out.println("0-arg constructor is called");
		stuId= "Id1";
		stuName = "DefaultName";
		stuAge = 10;
	}
	public Student(String stuId, String stuName, int stuAge) {
		super();
		
		System.out.println("parameterized constructor is called");
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	
	
}

public class ConstructorExample2 {
	
	public static void main(String[] args)
	{
		Student student = new Student();
		System.out.println(student.getStuId());
		System.out.println(student.getStuName());
		System.out.println(student.getStuAge());
		
		Student student1 = new Student("Id100", "Rohit", 25);
		
		System.out.println(student1.getStuId());
		System.out.println(student1.getStuName());
		System.out.println(student1.getStuAge());
	}

}
