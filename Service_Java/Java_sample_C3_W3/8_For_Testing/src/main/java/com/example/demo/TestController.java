package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	ArrayList<String> stuffList = new ArrayList<String>();

	@RequestMapping(value = "/date", method = RequestMethod.GET)
	public String GetDate() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date); // 2016/11/16 12:08:43

	}

	@RequestMapping(value = "/stuff", method = RequestMethod.POST)
	public String addStuff(@RequestParam(defaultValue = "000") String stuff) {
		stuffList.add(stuff);
		
		return "added:" + stuff + " into stuff";
	}

	@RequestMapping(value = "/stuff", method = RequestMethod.GET)
	public String showStuff() {
		System.out.println(stuffList);
		return stuffList.toString();
	}

}
