package myPackage;

import java.util.Scanner;

public class Employee {

	private String name;
	private int age;
	private int salary;
	
	Employee()
	{
		this.name=null;
		this.age=0;
		this.salary=0;
	}
	
	/*
	 * Employee(String n,int a,int s) { name=n; age=a; salary=s;
	 * 
	 * }
	 */
	 
	
	Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public void readData()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter name :");
		name=obj.nextLine();
		System.out.println("Enter age :");
		age=obj.nextInt();
		System.out.println("Enter salary :");
		salary=obj.nextInt();
		obj.close();
	}
	
	public void printData()
	{
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Salary is " + salary);
	}
}
