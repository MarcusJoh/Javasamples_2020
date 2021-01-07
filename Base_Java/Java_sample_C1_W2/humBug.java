package humbug;

public class humBug {

	public static void main(String[] args) {
		
		//change to int for humbog
		for (double i = 1; i <= 100; i++) {

			System.out.println((i / 15));
			System.out.println("value: " + i);

		}

		String mes = "";
		for (int i = 1; i <= 100; i++) {
			mes = Integer.toString(i);
			if ((i / 15) * 15 == i) {
				mes = "humBug";
			} else if ((i / 5) * 5 == i) {
				mes = "hum";
			} else if ((i / 3) * 3 == i) {
				mes = "Bug";
			}

			// System.out.println(mes);

			for (int number = 1; number <= 100; number++) {
				if (number % 15 == 0) {
					System.out.println("humBug");
				} else if (number % 3 == 0) {
					System.out.println("hum");
				} else if (number % 5 == 0) {
					System.out.println("Bug");
				} else {
					System.out.println(number);
				}
			}

		}

	}

}
