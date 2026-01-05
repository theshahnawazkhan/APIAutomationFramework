package com.api.models.response;

import java.util.List;

public class LoginResponse {

    private String id;
    private String username;
    private String email;
    private List<String> roles;
    private String type;
    private String token;
    
    public LoginResponse() {
    	
    }
    
    public LoginResponse(String id, String username, String email, List<String> roles, String type, String token) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.type = type;
		this.token = token;
	}
 
    public String getId() {
        return id;
    }

   
	public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResponse [id=" + id + ", username=" + username +
               ", email=" + email + ", roles=" + roles +
               ", type=" + type + ", token=" + token + "]";
    }
}
