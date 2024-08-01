package com.email.entities;

public class Email {
 private String subject,message,to;

@Override
public String toString() {
	return "Email [subject=" + subject + ", message=" + message + ", to=" + to + "]";
}

public Email() {
	super();
	// TODO Auto-generated constructor stub
}

public Email(String subject, String message, String to) {
	super();
	this.subject = subject;
	this.message = message;
	this.to = to;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}
}
