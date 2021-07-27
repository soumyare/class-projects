package myPackage;

import java.util.Scanner;

public class Employee 
{
	private String name;
	private int age;
	public static String companyname="microsoft";
	
	public void readData()
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter name: ");
		name=obj.nextLine();
		System.out.println("Enter age: ");
		age=obj.nextInt();
	}
	
	public void writeData()
	{
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Company is " + companyname);
	}
	


}
