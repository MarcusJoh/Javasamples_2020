package com.example.demo;

import java.util.Date;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController implements ErrorController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String start() {
		String index = "";
		index += "<html><head><title>This is my api</title></head>";
		index += "<body>";
		index += "<h4>this is all the methods of this API</h4>";
		index += "<ul>";
		index += " <li><a href=\"/hello\">The Hello!</a></li> ";
		index += "</ul>";

		index += "</body></html>";
		return index;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}

	private static final String PATH = "/error";

	@RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
	public String error() {
		return "No function that url please try the following" +start() ;
	}

	@Override
	public String getErrorPath() {
		
		return PATH;
	}

}
