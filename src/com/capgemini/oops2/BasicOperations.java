package com.capgemini.oops2;

import java.util.*;

public class BasicOperations 
{
	public static void main(String [] args)
	{
		int a1, b1, c1;
		
		//User Input
		Scanner sc = new Scanner(System.in);
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c1 = sc.nextInt();
		
		//Largest of three numbers
		if(a1 > b1)
		{
			if(a1>c1)
				System.out.println("Largest number = " + a1);
			else
				System.out.println("Largest number = " + c1);
		}
		else
		{
			if(b1 > c1)
				System.out.println("Largest number = " + b1);
			else
				System.out.println("Largest number = " + c1);
		}
		
		//Sum of three numbers
		System.out.println("Average of three numbers = " + a1+b1+c1);
		
		//Average of three numbers
		System.out.println("Average of three numbers = " + (a1+b1+c1)/3);
		
		//Marks input
		int [] a = new int[5];
		int sum = 0;
		System.out.println("Enter the marks for five subjects");
		for(int i=0;i<5; i++)
			a[i] = sc.nextInt();
		for(int i=0;i<5; i++)
		{
			sum = sum  + a[i];
		}
		System.out.println("Percentage of marks = " + sum/5);
	}	
}
