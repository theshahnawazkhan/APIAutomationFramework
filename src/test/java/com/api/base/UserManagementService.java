package com.api.base;

import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class UserManagementService extends BaseService {
	
	private static final String BASE_PATH = "/api/users/";
	
	
	public Response getProfileInfo(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH +"profile");
	} 
	
}
