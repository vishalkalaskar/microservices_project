package com.example.ms3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Micro3Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro3Application.class, args);
	}

}
