package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoundController {

	@RequestMapping(value = "/guessChar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String guessChar(@RequestParam char letter) {

		// boolean match = Charcheck.matchV(letter);
		// boolean match = Charcheck.match(letter, Alalfabet.ranLetter());
		char chosenLetter = Alalfabet.ranLetter();
		boolean match = Charcheck.match(letter, chosenLetter);

		String pattern = "{ \"InLetter\":\"%s\", \"ChosenLetter\":\"%s\", \"Match\": \"%s\"}";

		return String.format(pattern, letter, chosenLetter, match);
	}

	@RequestMapping(value = "/guessChars", method = RequestMethod.GET)
	public String guessChars(@RequestParam char letter, @RequestParam int rounds) {

		return Charcheck.matches(letter, rounds).toString();
	}

	//http://localhost:8080/guessCharsJSON?letter=A&rounds=1000
	@RequestMapping(value = "/guessCharsJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String guessCharsJSON(@RequestParam char letter, @RequestParam int rounds) {

		return Charcheck.matchesJSON(letter, rounds);
	}

}
