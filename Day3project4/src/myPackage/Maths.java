package myPackage;

public class Maths {
	
	private int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	
	public int nCr(int n,int r)
	{
		return factorial(n)/(factorial(n-r)*factorial(r));
	}
	
	public int nPr(int n, int r)
	{
		return factorial(n)/factorial(n-r);
	}

}
