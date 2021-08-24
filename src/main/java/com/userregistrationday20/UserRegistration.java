package com.userregistrationday20;

import java.util.Scanner;

public class UserRegistration {
	
	public boolean validateFirstName(String firstName) {
			
		boolean returnFlag = true;
		if(Character.isUpperCase(firstName.charAt(0))) {
			
			if(firstName.length() < 3) {
				
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
    public static void main( String[] args ) {
        
    	UserRegistration user = new UserRegistration();
    	Scanner sc = new Scanner(System.in);
    	System.out.print( "Enter your first name : ");
    	String firstName = sc.nextLine(); 
    	user.validateFirstName(firstName);
    	sc.close();
    }
}
