package com.example.request.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.model.Tourist;
import com.example.request.service.ITourismMgmtService;

@RestController
public class TouristController 
{
	
   @Autowired
   private ITourismMgmtService  ITourismMgmtService ;
   
   @PostMapping("/register")
   public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist)
   {
	    try
	    {
	    	String resultMsg=ITourismMgmtService.registerTourist(tourist);
	    	 return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);
	    }
	    catch(Exception e)
	    {
	    	
	 	   return new ResponseEntity<String>("problem in tourist Enllorment",HttpStatus.INTERNAL_SERVER_ERROR); //500

	    }
	   
   }
   
   @GetMapping("/findAll")
   public  ResponseEntity<?> displayallTourist()
   {
	  try 
	  {
		  List<Tourist> list=ITourismMgmtService.fetchAllTourist();
		   return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	  }
	  catch(Exception e)
	  {
		  return new ResponseEntity<String>("Problem in fetching Tourist",HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
   }
   
   @GetMapping("/find/{id}")
   public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id)
   {
	   try {
		   Tourist tourist=ITourismMgmtService.fetchTouristById(id);
		   return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
	   }
	   catch(Exception e)
	   {
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
   }
   
   @PutMapping("/modify")
   public ResponseEntity<String> modifyTourist(@RequestBody Tourist tourist)
   {
	   try
	   {
		   String msg= ITourismMgmtService.updateTouristDetails(tourist);
		   return new ResponseEntity<String>(msg,HttpStatus.OK);
	   }
	   catch(Exception e)
	   {
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	   
   }
   
   @DeleteMapping("/delete")
   public ResponseEntity<String> delettouristr(@RequestBody Tourist tourist)
   {
	   try
	   {
		   String msg= ITourismMgmtService.deleteTouristDetails(tourist);
		   return new ResponseEntity<String>(msg,HttpStatus.OK);
	   }
	   catch(Exception e)
	   {
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
   }
   
   @PatchMapping("/packageModify/{id}/{packageType}")
   public ResponseEntity<String> partiallyupdate(@PathVariable("id") Integer id,@PathVariable("packageType") String packageType)
   {
	  try
	  {
		  String msg=ITourismMgmtService.partialUpdateTouristDetails(id, packageType);
		  return new ResponseEntity<String>(msg,HttpStatus.OK);
	  }
	  catch(Exception e)
	  { 
		  e.printStackTrace();
		  return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	  }
   }
	
   @DeleteMapping("/deleteById/{start}/{end}")
   public ResponseEntity<String> removerecord(@PathVariable("start") Integer start,@PathVariable("end") Integer end)
   {
	   try 
	   {
		   String msg=ITourismMgmtService.deleteRecordsByIDRange(start, end);
		   return new ResponseEntity<String>(msg,HttpStatus.OK);
	   }
	   catch(Exception e)
	   { 
		   e.printStackTrace();
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	   
   }
}
