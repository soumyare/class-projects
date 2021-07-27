package myPackage;

public class Myclass {

	static int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}

	public static void main(String[] args) {
		
		int n1=5,n2=6,n3=7;
		System.out.println(factorial(n1));
		System.out.println(factorial(n2));
		System.out.println(factorial(n3));
		
	}

}
