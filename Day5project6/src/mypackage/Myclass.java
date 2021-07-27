package mypackage;

public class Myclass 
{
	
	public final static float PI=(float)22/7;
	
	static class algebra
	{
		public static int add(int a, int b)
		{
			return a+b;
		}
		
	}
	
	static class geometry
	{
		public static float circlearea(int r)
		{
			return PI*r*r;
		}
		public static float circleperimeter(int r)
		{
			return 2*PI*r;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(Myclass.algebra.add(5, 6));
		System.out.println(Myclass.geometry.circlearea(6));
		System.out.println(Myclass.geometry.circleperimeter(7));

	}

}
