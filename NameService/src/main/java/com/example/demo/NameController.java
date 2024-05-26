package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class NameController {

	@GetMapping(value = "/nameservice/sayName")
	public String sayName() {
		return "Animesh";
	}
}
