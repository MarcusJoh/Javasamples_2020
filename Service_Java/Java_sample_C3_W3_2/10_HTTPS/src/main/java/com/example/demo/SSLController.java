package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SSLController{
	
	@RequestMapping("/secured")
	public String secured(){
		System.out.println("Insides are safe?");
		return "Hello safe user !!! : " + new Date();
	}
}
