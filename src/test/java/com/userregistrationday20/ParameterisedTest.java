package com.userregistrationday20;

import org.junit.Before;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;

@RunWith(Parameterized.class)
public class ParameterisedTest {
	private String email;
	private boolean expectedResult;
	private UserRegistration user;
	
	public  ParameterisedTest(String email,boolean expectedResult) {
		super();
		this.email=email;
		this.expectedResult = expectedResult;
	}
	@Before
	public void initialize() {
		user = new UserRegistration();
	}
		
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc.xyz@gmail.com",false},{"abc.xyz@bl.co.in",true},{"vismaya.abc@bl.co.in",true}});
	}
	
	@Test
	public void validateEmail() {
		
		Assertions.assertEquals(expectedResult,user.validateEmail(email));
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ParameterisedTest.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
