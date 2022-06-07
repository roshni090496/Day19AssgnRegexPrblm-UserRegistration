package com.company;

import java.util.Scanner;

public class UseCase3 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your Email: ");
	  String phone = sc.next();
	  String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	  //Matching the given phone number with regular expression
	  boolean result = phone.matches(regex);
	  if(result) {
		 System.out.println("Given email-id is valid");
	  } else {
		 System.out.println("Given email-id is not valid");
	  }
   }
}