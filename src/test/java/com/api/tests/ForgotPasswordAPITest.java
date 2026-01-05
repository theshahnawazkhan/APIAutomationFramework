package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class ForgotPasswordAPITest {

	@Test(description = "Verify if forgot password API is working")
	public void forgotPasswordTest() {

		AuthService authService = new AuthService();
		Response response = authService.forgotPassword("demo124@gmail.com");
		System.out.println(response.asPrettyString());

	}

}
