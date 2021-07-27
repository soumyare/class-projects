package mypackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		int age;
		Scanner obj =new Scanner(System.in);
		
		char ch='i';
		do 
		{
			System.out.println("Enter age:");
			age=obj.nextInt();
			
			if (age<=0 || age>100)
			{
				System.out.println("Enter valid age");
				
			}
			else
			{
				System.out.println("valid age");
				ch='v';
			}
		}while(ch!='v');
		obj.close();
			
			
			
		
		

	}

}
