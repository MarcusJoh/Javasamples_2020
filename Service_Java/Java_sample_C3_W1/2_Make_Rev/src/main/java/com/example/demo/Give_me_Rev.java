package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class Give_me_Rev {
	
	//using get method and hello-world as URI  
		@RequestMapping(method = RequestMethod.GET, path = "/hello")
		public String helloWorld() {
			return "Hello World";
		}

		@RequestMapping(value = "/torev", method = RequestMethod.GET)
		public String update(String rev) {
			StringBuilder sb = new StringBuilder(rev);

			return sb.reverse().toString();
		}

}
