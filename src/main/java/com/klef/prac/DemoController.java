package com.klef.prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/")
	public String home() {
		return "This is Home Page";
	}
	@GetMapping("/student")
	public String student() {
		return "Hii I am a Student";
	}
	@GetMapping("/teacher")
	public String teacher() {
		return "Hii I am a teacher";
	}

}
