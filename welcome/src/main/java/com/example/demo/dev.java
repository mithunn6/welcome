package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dev {
	@GetMapping("Himalayan")
public String Welcome() {
		return "Welcome String Boot!";
	}

}
