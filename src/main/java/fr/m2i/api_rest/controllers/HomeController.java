package fr.m2i.api_rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping
	public String returnHello() {
		return "Hello";
	}
	
	@GetMapping("/admin")
	public String returnAdmin() {
		return "Hello Admin";
	}

}
