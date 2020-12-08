package ReactFaster;

import java.util.Random;
import java.util.Scanner;

public class reactFasterwithString {

	public static void main(String[] args) throws InterruptedException {
		Scanner reader = new Scanner(System.in);

		System.out.println("3");
		Thread.sleep(1000);

		System.out.println("2");
		Thread.sleep(1000);

		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("GO");
		
		
		
		String wordToWrite = ranWord();
		String inputWord = "";

		System.out.println("Write a " + wordToWrite);

		long startTime = System.currentTimeMillis();
		long stopTime = 0;
		while (!wordToWrite.equals(inputWord)) {

		 inputWord = reader.nextLine();
			

			stopTime = System.currentTimeMillis();

		}
		long reactionTime = stopTime - startTime;

		System.out.println(reactionTime + " ms");
	}

	static String ranWord() {
		// char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] words = {"hej","hi"};
		Random rand = new Random();
		int ranNumber = rand.nextInt(words.length);
		String word = words[ranNumber];

		return word;

	}

}
