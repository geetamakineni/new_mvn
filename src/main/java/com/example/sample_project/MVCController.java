package com.example.sample_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {

	@RequestMapping("/home")
	public String sample() {
		return "Sample";
	}
}
