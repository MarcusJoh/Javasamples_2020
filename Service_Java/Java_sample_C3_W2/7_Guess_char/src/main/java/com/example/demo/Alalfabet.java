package com.example.demo;

import java.util.Random;

public class Alalfabet {

	public final static char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };



	public static char ranLetter() {

		Random rand = new Random();
		int ranNumber = rand.nextInt(ALPHABET.length);
		char letter = ALPHABET[ranNumber];

		return letter;

	}

}
