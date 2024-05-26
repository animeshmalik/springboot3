package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Value("${student.welcomemsg}")
	private String welcomeMsg;

	@Value("${student.welcomeencryptedmsg}")
	private String welcomeEncMsg;
	@GetMapping(value = "/student/details")
	public String getDetails() {
		return welcomeMsg+ " student and your passphrase is "+welcomeEncMsg;
	}
}
