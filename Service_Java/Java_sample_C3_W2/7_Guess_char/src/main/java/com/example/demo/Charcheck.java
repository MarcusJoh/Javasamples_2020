package com.example.demo;

import java.util.ArrayList;

public class Charcheck {

	public static boolean match(char letter, char chosenLetter) {

		// return letter==Alalfabet.ranLetter();
		return letter == chosenLetter;

	}

	public static ArrayList<RoundBean> matches(char letter, int rounds) {

		ArrayList<RoundBean> allRounds = new ArrayList<RoundBean>();
		for (int i = 0; i <= rounds; i++) {
			char chosenLetter = Alalfabet.ranLetter();
			RoundBean aRound = new RoundBean(i, letter, chosenLetter, Charcheck.match(letter, chosenLetter));
			allRounds.add(aRound);

		}

		return allRounds;
	}

	public static String matchesJSON(char letter, int rounds) {

		ArrayList<RoundBean> allRoundsJSON = matches(letter, rounds);
		String JSONtoSend = "  {\"Round\": [";

		for (int i = 0; i < allRoundsJSON.size(); i++) {

			String pattern = "{ \"RoundNum\":\"%s\",\"InLetter\":\"%s\", \"ChosenLetter\":\"%s\", \"Match\": \"%s\"}";

			JSONtoSend += String.format(pattern, i ,allRoundsJSON.get(i).getInLetter(),
					allRoundsJSON.get(i).getChosenLetter(), allRoundsJSON.get(i).isMatch());

			if (i < rounds) {
			
				JSONtoSend += ",";
			}

		}
		JSONtoSend += "]}";

		return JSONtoSend;
	}

}
