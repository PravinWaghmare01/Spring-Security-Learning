package com.Veracity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class UserController {
	@GetMapping("/admin")
	public String Admin() {
		return "Get admin Successfully";
	}
	@GetMapping("/user")
    public String User() { 
		return "Get user Successfully";
	}
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome Successfully";
		
		}
}
