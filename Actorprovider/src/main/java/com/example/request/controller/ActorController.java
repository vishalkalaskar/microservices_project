package com.example.request.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.model.ActorModel;

@RestController
@RequestMapping("/actor")
public class ActorController 
{
 
	@PostMapping("/register")
	public ResponseEntity<String> registerActor(@RequestBody ActorModel actor)
	{
		
		return new ResponseEntity<String>("actor data"+actor,HttpStatus.OK);
		
	}
	


	
}
