package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping
	public String hello() {
		return "O grupo que mais gosto é o da minha família, por todo o suporte que me dão.";
	}
}
