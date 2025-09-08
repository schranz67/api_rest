package fr.m2i.api_rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/admin")
	public String hetHelloAdmin() {
		return "Hello Admin";
	}

}
