package com.demo;
class Employee
{
void display2()
{
	System.out.println("display2");
}
}
public class Student5  extends Employee{

	int id;
	String name;
	
	void display()
	{
		System.out.println("display");
	}
	public static void main(String[] args) {
		
		Student5 s5=new Student5();
		s5.display();
		s5.display2();
		
		Employee e=new Employee();
		
		
	}
	
	
}
