package com.ncu.validators;
import java.util.regex.*;
class NameValidator
{
	boolean nameValidator(String filename,String filetype)
	{
		System.out.println("File name is: "+filename+" and its type is: "+filetype+" ");
		boolean b;
		b = emptyFileName(filename);
		if(b==true)
		{
			return false;
		}
		b = missingDot(filename);
		if(b== true)
		{
			return false;
		}
		return true;
	}
	boolean emptyFileName(String filename)
	{
		if (filename.equals(""))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean missingDot(String filename)
	{
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(filename);
		boolean value = costMatcher.find();
		if (value == true)
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}

}

class Testnamevalidators
{
	public static void main(String[] args)
	{
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("","csv");
		System.out.println(checkValidator);
	}
}