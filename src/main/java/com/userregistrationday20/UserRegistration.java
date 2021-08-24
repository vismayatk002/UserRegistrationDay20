package com.userregistrationday20;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean validateName(String Name) {
			
		boolean returnFlag = true;
		if(Character.isUpperCase(Name.charAt(0))) {
			
			if(Name.length() < 3) {
				
				System.out.println( "First name should have minimum 3 letters");
				returnFlag = false;
			}
		}
		else {
			System.out.println( "first letter must be caps");
			returnFlag = false;
		}
		return returnFlag;
	}
	
	public boolean validateEmail(String email) {
			
		String regex = "^[A-Za-z](.+)@(.+)$"; 
		Pattern pattern = Pattern.compile(regex); 
		if(pattern.matcher(email).matches()) {
			System.out.println( "True");
			return true;
		}
		else {
			System.out.println( "False");
			return false;
		}
	}
	
	public boolean validateMobileNo(String mobNo) {
		
		Pattern pattern = Pattern.compile("91[0-9]{10}");
		if(pattern.matcher(mobNo).matches()) {
			return true;
		}
		else {
			System.out.println( "Invalid Mobile number");
			return false;
		}
	}
	
	public boolean validatePassword(String password) {
		
		boolean returnFlag = true;
		Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
		if(password.length() < 8) {
			
			System.out.println( "Password should have minimum 8 characters");
			returnFlag = false;
		}
		else if (!UpperCasePatten.matcher(password).find()){

			System.out.println("Password must have atleast one uppercase character");
			returnFlag=false;
		}
		return returnFlag;
	}
	
    public static void main( String[] args ) {
        
    	UserRegistration user = new UserRegistration();
    	Scanner sc = new Scanner(System.in);
    	System.out.print( "Enter your first name : ");
    	String firstName = sc.nextLine(); 
    	if(user.validateName(firstName)) {
    		System.out.print( "Enter your last name : ");
    		String lastName = sc.nextLine(); 
    		if(user.validateName(lastName)) {
	    		System.out.print( "Enter your Mobile Number : ");
	    		String mobNo = sc.nextLine(); 
	    		if(user.validateMobileNo(mobNo)) {
		    		System.out.print( "Enter your Password : ");
		    		String password = sc.nextLine(); 
		    		user.validatePassword(password);
	    		}
    		}
    	}
    	
    	String emailId1 = "abc@yahoo.com";
    	String emailId2 = "abc-100@yahoo.com";
    	String emailId3 = "abc.100@yahoo.com";
    	String emailId4 = "abc111@abc.com";
    	String emailId5 = "abc-100@abc.net";
    	String emailId6 = "abc.100@abc.com.au";
    	String emailId7 = "abc@1.com";
    	String emailId8 = "34abc@gmail.com.com";
    	String emailId9 = ".abc+100@gmail.com";
    	user.validateEmail(emailId1);
    	user.validateEmail(emailId2);
    	user.validateEmail(emailId3);
    	user.validateEmail(emailId4);
    	user.validateEmail(emailId5);
    	user.validateEmail(emailId6);
    	user.validateEmail(emailId7);
    	user.validateEmail(emailId8);
    	user.validateEmail(emailId9);
    	
    	sc.close();
    }
}