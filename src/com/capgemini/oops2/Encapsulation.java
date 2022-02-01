package com.capgemini.oops2;
class Employee
{
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	private int empID;
	private String name;
	private float salary;
	
}
public class Encapsulation 
{
	public static void main(String [] args)
	{
		Employee e1=new Employee(101, "AAA", 10000);
		System.out.println(e1.getEmpID());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		Employee e2=new Employee(102, "BBB", 25000);
		System.out.println(e2.getEmpID());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		Employee e3=new Employee(103, "CCC", 70000);
		System.out.println(e3.getEmpID());
		System.out.println(e3.getName());
		System.out.println(e3.getSalary());
	}
}
