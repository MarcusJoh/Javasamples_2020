package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

	@RequestMapping("/def")
	public String RequestDefault() {

		return "THIS IS @RequestMapping defaulting to Get";

	}

	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String RequestGetPath() {

		return "THIS IS @RequestMapping set to be GET with Path";

	}
	// path is an alias for value, mostly the same but value allows for several
	// mappings

	@RequestMapping(value = { "/getVal", "/moreVal" }, method = RequestMethod.GET)
	public String RequestGetValue() {

		return "THIS IS @RequestMapping set to be GET with  Value";

	}

	@GetMapping("/getOnly")
	public String RequestGetMap() {

		return "THIS IS @GetMapping for a quick way to do GET";

	}

	// @RequestMapping can do several methods,GetMapping only does the one method

	@RequestMapping(path = "/allMethod", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
	public String RequestMore() {

		return "THIS IS @RequestMapping set to be GET/POST/PUT";

	}
	
	
	
	
	
	
	
	//@RequestParam to get the parameter
	//?name=MEE
	@GetMapping("/para")
	public String RequestParams(@RequestParam String name) {

		return "Name: " + name;

	}
	
	//defaultValue for when no value is sent
	@GetMapping("/paraDef")
	public String RequestDef(@RequestParam(defaultValue = "000") String name) {

		return "Name: " + name;

	}
	
	
	
	
	//many values
	//?first=1&second=2
	@RequestMapping(method = RequestMethod.GET, path = "/two")
	public double two(int first, int second)  {
		
		return first+second;
	} 
	
	
	//many more values
	//?value=1&value=2&value=3&value=4
	@RequestMapping(method = RequestMethod.GET, path = "/more")
	public String ArrInt(@RequestParam ArrayList<String> value)  {
		
		return value.toString();
	} 
	
	
	
	


	
	

}
