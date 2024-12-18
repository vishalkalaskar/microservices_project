package com.example.jsondatabinding.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsondatabinding.model.CustomerModel;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class BindingController 
{    
	
	@GetMapping(value="/r",  consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerModel> showDatar() throws IOException
	{ 
		ObjectMapper objectMapper = new ObjectMapper();
		
		URL url = new URL("http://localhost:8089/data.json");
		CustomerModel cust=objectMapper.readValue(url, CustomerModel.class); 
		
		return new ResponseEntity<CustomerModel>(cust,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/rr",  consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerModel> showDatarr() throws IOException
	{ 
		List<CustomerModel> cust=null;
	
		try {
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();
//			URI uri = new URI("http://localhost:8089/data.json");
//			String mainPath = Paths.get(uri).toString();
            
			URL url = new URL("http://localhost:8089/data.json");
			//File file = Paths.get(url.toURI().getPath()).toFile();

		    // convert JSON array to list of books
			//Paths.get("books.json").toFile()
		    cust = Arrays.asList(mapper.readValue(Paths.get(url.toURI().getPath()).toFile(), CustomerModel[].class));

		    // print books
		    cust.forEach(System.out::println);

		} catch (Exception ex)
		{
		    ex.printStackTrace();
		}
	
	   return new ResponseEntity<CustomerModel>((CustomerModel) cust,HttpStatus.OK);
	}
	}
