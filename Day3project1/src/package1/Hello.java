package package1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=obj.nextLine();
		System.out.println("Enter your age");
		age=obj.nextInt();
		System.out.println("your name is "+ name);
		System.out.println("your age is "+ age);
		


	}

}
