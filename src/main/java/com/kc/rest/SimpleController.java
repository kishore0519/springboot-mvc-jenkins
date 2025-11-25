package com.kc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class SimpleController {
	
	@GetMapping
	public String sayHi() {
		System.out.println("An identifier for this endpoint");
		return "Hi!!";
	}

}
