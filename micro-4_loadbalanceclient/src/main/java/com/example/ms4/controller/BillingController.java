package com.example.ms4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController
{
	@GetMapping("/biiling/info")
	public ResponseEntity<String> billing()
	{
		return new ResponseEntity<String>("Your Discount offfer is RS 50000",HttpStatus.OK);
	}

}
