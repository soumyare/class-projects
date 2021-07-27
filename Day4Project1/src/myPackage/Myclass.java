package myPackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {

		//declare array
		int max=5;
		int[] data= new int[max];
		int sum=0,average;
		
		Scanner obj=new Scanner(System.in);
		
		//read nos from user
		for(int i=0;i<max;i++)
		{
			System.out.println("Enter number :");
			data[i]=obj.nextInt();
		}
		
		//finding sum
		for(var d:data)
			sum=sum+d;
		
		//finding average
		average=sum/max;
		
		System.out.println("sum = " + sum);
		System.out.println("average = " +average);
			
	}

}
