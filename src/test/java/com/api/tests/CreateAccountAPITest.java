package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class CreateAccountAPITest {

	@Test(description = "Verify if Signup API is working")
	public void createAccountTest() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("demo1234").password("demo12345")
				.email("demo12@gmail.com").firstName("Demo1").lastName("User").mobileNumber("9876543260").build();

		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());

	}

}
