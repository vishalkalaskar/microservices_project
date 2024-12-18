package com.example.aop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.example.aop.aspect.PerformenceMonitoringAspect;
import com.example.aop.service.BankService;




@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("com.example.aop.aspect")
@Import(PerformenceMonitoringAspect.class)
public class Aop1Application {

	 
	public static void main(String[] args) {
		SpringApplication.run(Aop1Application.class, args);
		
		
	
	
	  try 
	   {
	   	System.out.println("simple interest amount"+BankService.calcSimpleIntrestAmmount(100000.0, 2.0,12.0));
	   	System.out.println("---------------------------------------------------");
	   	System.out.println("compound interest amount"+BankService.calcCompoundIntrestAmmount(100000.0, 2.0,12.0));
	   }
	   catch(Exception e)
	   {
	   	e.printStackTrace();
	   }
	
}
}
