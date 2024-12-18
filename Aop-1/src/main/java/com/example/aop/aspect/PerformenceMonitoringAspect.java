package com.example.aop.aspect;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;




@Aspect
@Component
public class PerformenceMonitoringAspect
{
	
	  private long start,end;
	  
      @Around(value="execution(* com.example.aop.service.BankService.*(..))")  //* for all method and (..) any number of parameters
      //@Around("@annotation(com.example.aop.service)")
      public Object perfomace(ProceedingJoinPoint pjp) throws Throwable
	  {
		  start= System.currentTimeMillis();
		  //pjp.getSignature()
		  System.out.println(pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+"has enterd int b.method at"+new Date());
		  Object retVal = pjp.proceed();
		  //end
		  end=System.currentTimeMillis();
		  System.out.println(pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+"has exited from int b.method at"+new Date());
		  System.out.println(pjp.getSignature()+"has taken"+(end-start)+"ms to complete excution");
		  return retVal;
	  }
}
