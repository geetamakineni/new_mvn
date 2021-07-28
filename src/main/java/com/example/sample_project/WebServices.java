package com.example.sample_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServices {

	@GetMapping("/hello")
	public String sayhello() {
		return "hello world";
	}
}
