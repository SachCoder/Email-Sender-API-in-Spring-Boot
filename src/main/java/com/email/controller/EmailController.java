package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.entities.Email;
import com.email.entities.EmailRespose;
import com.email.service.EmailService;

@RestController
@CrossOrigin
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/")
	public String firstHandler() {
		return "click";
	}
	@PostMapping("/sendemail")
	public ResponseEntity<?> sendEmail(@RequestBody Email email){
		System.out.print(email);
		boolean result = this.emailService.sendEmail(email.getSubject(),email.getMessage(),email.getTo());
		if(result) {
			return ResponseEntity.ok(new EmailRespose("email is successfully sent"));
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new EmailRespose("email is successfully sent"));
		}
		
	}
}
