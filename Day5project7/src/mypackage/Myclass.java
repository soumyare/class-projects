package mypackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Myclass {

	public static void main(String[] args) {
		
		Pattern p= Pattern.compile("*?");
		Matcher m = p.matcher(" ");
		
		if(m.matches())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
