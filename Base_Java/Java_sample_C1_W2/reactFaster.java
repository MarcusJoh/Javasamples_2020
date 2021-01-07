package ReactFaster;

import java.util.Random;
import java.util.Scanner;

public class reactFaster {

	public static void main(String[] args) throws InterruptedException {
		Scanner reader = new Scanner(System.in);

		System.out.println("3");
		Thread.sleep(1000);

		System.out.println("2");
		Thread.sleep(1000);

		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("GO");
		
		
		
		char letterToWrite = ranLetter();
		char inputLetter = ' ';

		System.out.println("Write a " + letterToWrite);

		long startTime = System.currentTimeMillis();
		long stopTime = 0;
		while (letterToWrite != inputLetter) {

			String str = reader.nextLine();
			inputLetter = str.charAt(0);

			stopTime = System.currentTimeMillis();

		}
		long reactionTime = stopTime - startTime;

		System.out.println(reactionTime + " ms");
	}

	static char ranLetter() {
		// char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random rand = new Random();
		int ranNumber = rand.nextInt(alphabet.length);
		char letter = alphabet[ranNumber];

		return letter;

	}

}
