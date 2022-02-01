package com.capgemini.oops2;
import java.util.*;
public class ArrayOperations 
{
	public static void main(String [] args)
	{
		//array creation
		int [] a = new int[10];
		
		//insertion
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10; i++)
			a[i] = sc.nextInt();
		
		//printing elements in an array
		for(int i=0;i<10; i++)
			System.out.println(a[i]);
		
		//duplicate value in an array
		for(int i=0;i<10; i++)
		{
			for(int j=i+1;j<10; i++)
			{
				if(a[i] == a[j])
					System.out.println("Duplicate element =" + a[i]);
			}
		}
		
		//Sorting an array
        Arrays.sort(a);
        System.out.printf("Modified Array");
        for(int i=0;i<10; i++)
			System.out.println(a[i]);
		
		//Largest Element
		int max=0;
		for(int i=0; i<10;i++)
		{
			if(a[i] > max)
				max=a[i];
		}
		System.out.println("Largest number =" + max);
		
		//Smallest Element
		int min=100;
		for(int i=0; i<10;i++)
		{
			if(a[i] < min)
				min=a[i];
		}
		System.out.println("Smallest number =" + min);		
	}
}
