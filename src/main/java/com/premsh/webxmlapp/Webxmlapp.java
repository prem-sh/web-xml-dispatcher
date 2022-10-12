package com.premsh.webxmlapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webxmlapp {
	public Webxmlapp() {
		System.out.println("Bean Created");
	}
	@GetMapping("/")
	public ResponseEntity<String> index(){
		System.out.println("I am triggered");
		return ResponseEntity.ok("Helow hii !!");
	}
}
