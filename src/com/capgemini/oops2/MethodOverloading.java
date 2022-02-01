package com.capgemini.oops2;
class shape
{
	void area() {}
}
class square extends shape
{
	void area (int a)
	{
		System.out.println("Area of the square " + (a*a));
	}
}
class rectangle extends shape
{
	void area (int a, int b)
	{
		System.out.println("Area of the rectangle " + (a*b));
	}
}
public class MethodOverloading 
{
	public static void main(String [] args)
	{
		square s = new square();
		s.area(5);
		rectangle r = new rectangle();
		r.area(10, 5);
	}
}
