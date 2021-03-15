package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
	// public static int WINS, LOSSES, TIES;

	
	
	
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping(value = "/Score/wins", method = RequestMethod.GET)
	public int getWins() {
		//return WINS;
		return ScoreBean.WINS;
	}

	@RequestMapping(value = "/Score/losses", method = RequestMethod.GET)
	public int getLosses() {
		return ScoreBean.LOSSES;
	}

	@RequestMapping(value = "/Score/ties", method = RequestMethod.GET)
	public int getTies() {
		return ScoreBean.TIES;
	}

	@RequestMapping(value = "/Score/wins", method = RequestMethod.POST)
	public int increaseWins() {
		ScoreBean.WINS++;
		return ScoreBean.WINS;
	}

	@RequestMapping(value = "/Score/losses", method = RequestMethod.POST)
	public int increaseLosses(int losses) {
		ScoreBean.LOSSES++;
		return ScoreBean.LOSSES;
	}

	@RequestMapping(value = "/Score/ties", method = RequestMethod.POST)
	public int increaseTies() {
		ScoreBean.TIES++;
		return ScoreBean.TIES;
	}

	// { "wins":"5", "losses":"3", "ties": "0"}
	@RequestMapping(value = "/Scoreset", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getScoreBean() {
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, ScoreBean.WINS, ScoreBean.LOSSES, ScoreBean.TIES);

	}

	//extra!! figure out how PUT is triggered 
	@RequestMapping(value = "/Score", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public String update(int wins, int losses, int ties) {
		ScoreBean.WINS = wins;
		ScoreBean.TIES = ties;
		ScoreBean.LOSSES = losses;
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, ScoreBean.WINS, ScoreBean.LOSSES, ScoreBean.TIES);
	}
	
	
	
	
	
	
	
	
}
