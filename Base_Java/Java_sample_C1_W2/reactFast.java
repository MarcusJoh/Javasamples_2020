package ReactFaster;

import java.util.Scanner;

public class reactFast {

	public static void main(String[] args) throws InterruptedException {
		Scanner reader = new Scanner(System.in);

		System.out.println("3");
		Thread.sleep(1000);

		System.out.println("2");
		Thread.sleep(1000);

		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("GO");

		long startTime = System.currentTimeMillis();
		reader.next();
		long stopTime = System.currentTimeMillis();

		long reactionTime = stopTime - startTime;

		System.out.println(reactionTime + "ms");
	}

}
