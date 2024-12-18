package com.example.aop.service;

import org.springframework.stereotype.Service;

//primary logic

@Service
public class BankService
{
   public static double calcSimpleIntrestAmmount(double pamt,double rate,double time)
   {
	   System.out.println("BankService.calcSimpleIntrestAmmount");
	  return pamt*rate*time/100.0;
   }
   
   public static  double calcCompoundIntrestAmmount(double pamt,double rate,double time)
   {
	   System.out.println("BankService.calcCompoundIntrestAmmount");
	  return (pamt*Math.pow(1+rate/100, time))-pamt;
   }
 
}
