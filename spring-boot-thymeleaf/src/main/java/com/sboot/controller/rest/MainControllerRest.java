package com.sboot.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerRest {

	@GetMapping("/hello")
	public String hello() {
		return "Hello---------";
	}
}
