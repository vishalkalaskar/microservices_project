package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.service.BankService;

@RestController
public class DemoController 
{
	@Autowired
	public BankService banks;
	
	@GetMapping("/d")
	public String dmethod()
	{
		try 
		   {
		   	System.out.println("simple interest amount"+banks.calcSimpleIntrestAmmount(100000.0, 2.0,12.0));
		   	System.out.println("---------------------------------------------------");
		   	System.out.println("compound interest amount"+banks.calcCompoundIntrestAmmount(100000.0, 2.0,12.0));
		   }
		   catch(Exception e)
		   {
		   	e.printStackTrace();
		   }
		
		
		return "heel";
	}

}
