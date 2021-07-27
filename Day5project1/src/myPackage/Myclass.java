package myPackage;

public class Myclass 
{
	public static void main(String[] args) {
		
	int[] data = new int[] {1,2,3,4};
	
	for(int i=0;i<=3;i++)
		System.out.println(data[i]);
	
	for(int i=0;i<data.length;i++)
		System.out.println(data[i]);
	
	for(int d:data)
		System.out.println(d);
	
	for(var d:data)
		System.out.println(d);
	}
}
	
	
	
	


