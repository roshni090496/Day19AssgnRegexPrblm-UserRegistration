package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase2 {

	public static boolean isValidUsername(String name)
	{

		// Regex to check valid first name
		String regex = "^[A-Z]+[a-z]{3,10}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the first name is empty
		// return false
		if (name == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given firstname
		// and regular expression.
		Matcher m = p.matcher(name);

		// Return if the first name
		// matched the ReGex
		return m.matches();
	}

	// Driver Code
	public static void main(String[] args)
	{
		int exit = 0;
		while(exit != 1)
		{
		System.out.println("enter last name");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(isValidUsername(str1));

		}
	}
}