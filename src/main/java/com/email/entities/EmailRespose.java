package com.email.entities;

public class EmailRespose {
 String token;

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

public EmailRespose() {
	super();
	// TODO Auto-generated constructor stub
}

public EmailRespose(String token) {
	super();
	this.token = token;
}
}
