package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.merchantBean;
import com.example.demo.datebase.SQLconnection;

@RestController
public class WelcomeController {

	@RequestMapping(value = "/Search", method = RequestMethod.GET)
	public ArrayList<merchantBean> Search(@RequestParam String search) {

		String searchString = search;
		
		ArrayList<merchantBean> searchResult = new ArrayList<merchantBean>();

		// check if connection is open?
		if (SQLconnection.connectSQL()) {
			// send the string
			searchResult = SQLconnection.stateSQL(searchString, searchResult);

			return searchResult;
		} else {
			return searchResult;
		}

	}

}
