package com.example.demo;

public class RoundBean {
	private int round;
	private char inLetter;
	private char chosenLetter;
	private boolean match;

	public RoundBean(int round, char inLetter, char chosenLetter, boolean match) {

		this.round = round;
		this.inLetter = inLetter;
		this.chosenLetter = chosenLetter;
		this.match = match;
	}

	public int getRound() {
		return round;
	}

	public char getInLetter() {
		return inLetter;
	}

	public char getChosenLetter() {
		return chosenLetter;
	}

	public boolean isMatch() {
		return match;
	}

	public String toString() {
		return "Round:"+round+",InLetter:"+inLetter+",ChosenLetter:"+chosenLetter+",Match:"+match;
	}
}
