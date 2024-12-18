package com.example.ms3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/search")
public class OneController
{

	
	@GetMapping("/welcome")
	public String diplaymsg()
	{
		return "Welcome to the first Micro";
	}
}
