package com.example.request.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class actorclientController
{
    
	@PostMapping("/adata")
	public ResponseEntity<?> adata()
	{
		RestTemplate resttemplate = new RestTemplate();
		String servicurl = "http://localhost:8011/actor/register";
		String json_body = "{\"aid\":1001,\"name\":\"suresh\",\"age\":30.0,\"type\":\"hero\"}";	
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON); // to avoid the 406 error
	    HttpEntity entity = new HttpEntity( json_body,headers);
	    ResponseEntity<String> response = resttemplate.postForEntity(servicurl, entity,String.class);
	    System.out.println("response Body :: "+response.getBody());
	    System.out.println("response Body :: "+response.getHeaders().toString());
	    System.out.println("response Body :: "+response.getStatusCodeValue());
	   // System.out.println("response Body :: "+((PostMapping) response.getStatusCode()).name());
		return response;
	}
}
