package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(value = "/student/details")
	public String getDetails() {
		return "studentDetails";
	}
}
