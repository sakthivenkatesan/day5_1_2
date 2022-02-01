package com.capgemini.oops2;

class vehicle
{
	void print()
	{
		System.out.println("Print statement of vehicle class or the parent class");
	}
}
class bike
{
	void print()
	{
		System.out.println("Print statement of bike class or the child class");
	}
}
class car
{
	void print()
	{
		System.out.println("Print statement of car class or the child class");
	}
}
public class MethodOverriding 
{
	public static void main(String [] args)
	{
		bike b = new bike();
		b.print();
		car c = new car();
		c.print();
	}
}
