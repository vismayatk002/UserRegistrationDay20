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
			
		String regex = "^(.+)@bl.co(.+)$"; 
		Pattern pattern = Pattern.compile(regex); 
		if(pattern.matcher(email).matches()) {
			System.out.println( "valid");
			return true;
		}
		else {
			System.out.println( "Invalid Email id");
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
		Pattern UpperCasePatten = Pattern.compile("[A-Z]");
		Pattern numericNumberPatten = Pattern.compile("[0-9 ]");
		Pattern specialCharacterPatten = Pattern.compile("[^a-zA-Z0-9]");
		if(password.length() < 8) {
			
			System.out.println( "Password should have minimum 8 characters");
			returnFlag = false;
		}
		else if (!UpperCasePatten.matcher(password).find()){
		
			System.out.println("Password must have atleast one uppercase character");
			returnFlag=false;
		}
		else if (!numericNumberPatten.matcher(password).find()){
			
			System.out.println("Password must have atleast one numeric number");
			returnFlag=false;
		}
		else if (!specialCharacterPatten.matcher(password).find()){
			
			System.out.println("Password must have exactly one special character");
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
    			System.out.print( "Enter your email id : ");
        		String email = sc.nextLine();
        		if(user.validateEmail(email)) {
		    		System.out.print( "Enter your Mobile Number : ");
		    		String mobNo = sc.nextLine(); 
		    		if(user.validateMobileNo(mobNo)) {
			    		System.out.print( "Enter your Password : ");
			    		String password = sc.nextLine(); 
			    		user.validatePassword(password);
		    		}
        		}
    		}
    	}
    	sc.close();
    }
}