package com.Veracity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class UserController {
	@GetMapping("/getUser")
	public String getUser() {
		return "Get user Successfully";
	}
	@PostMapping("/setUser")
    public String setUser() { 
		return "Set user Successfully";
	}
	@PutMapping("/updateUser")
	public String updateUser() {
		return "Update User Successfully";
	}
}

