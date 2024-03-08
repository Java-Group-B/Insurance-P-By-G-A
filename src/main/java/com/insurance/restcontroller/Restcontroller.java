package com.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
@GetMapping("/getMessage")
	public String getMessage() {
		return "welcome to Insurance Project-1";
	}
}
