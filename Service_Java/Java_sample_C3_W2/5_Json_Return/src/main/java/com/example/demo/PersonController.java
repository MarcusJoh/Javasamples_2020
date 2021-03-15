package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	personBean bean;
	@PostMapping("/setPerson")
	public String setPerson(@RequestParam String fname, @RequestParam String lname) {

		 bean=new personBean(fname,lname);  
	       
	        
		
		return "person was made";

	}
	
	
	@GetMapping("/getPerson")
	public String getPerson() {

		return "the set person is " +bean.getFname()+" "+ bean.getLname();

	}
	
	
	
	
	
	//now as JSON
	@RequestMapping(value = "/getPersonJson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPersonJson() {
		String pattern = "{ \"Fname\":\"%s\",\"Lname\":\"%s\"}";
		return String.format(pattern, bean.getFname(), bean.getLname());

	}
	
	

	
	
	
	
}
