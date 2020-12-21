package tentaPack;

import java.util.ArrayList;
import java.util.Collections;

public class TentaSolutions {

	public static void main(String[] args) {

		ArrayList<String> lengthsOfStuff = new ArrayList<String>();

		lengthsOfStuff.add("ddddd");

		lengthsOfStuff.add("dddddddddddddd");
// ex 1
		System.out.println(lenthsofStrings(lengthsOfStuff));

		ArrayList<Integer> toSum = new ArrayList<Integer>();

		toSum.add(3);
		toSum.add(154);
		toSum.add(154);
		// ex 2
		System.out.println(sumOf(toSum));
		// ex 3
		System.out.println(averageOf(toSum));
		// ex 4
		System.out.println(sortOf(toSum));

		Person adam = new Person("adam");
		Person eva = new Person("eva");

		// ex 5
		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(adam);
		persons.add(eva);

		// ex 6
		System.out.println(ispalindrom("anna"));
		System.out.println(ispalindrom("nope"));

	}

	// ex 1
	public static ArrayList<Integer> lenthsofStrings(ArrayList<String> aList) {
		ArrayList<Integer> lengthsOfList = new ArrayList<Integer>();

		for (int i = 0; i < aList.size(); i++) {
			lengthsOfList.add(aList.get(i).length());

		}



		return lengthsOfList;
	}

	// ex 2
	public static int sumOf(ArrayList<Integer> aList) {
		int sum = 0;

		for (int i = 0; i < aList.size(); i++) {
			sum = sum + aList.get(i);

		}

		return sum;
	}

	// ex 3
	public static double averageOf(ArrayList<Integer> aList) {
		double sum = 0;

		for (int i = 0; i < aList.size(); i++) {
			sum = sum + aList.get(i);

		}
		double average = sum / aList.size();
		return average;
	}

	// ex 3
	public static ArrayList<Integer> sortOf(ArrayList<Integer> aList) {

		Collections.sort(aList);

		return aList;
	}

	// ex 5
	public static Boolean ispalindrom(String aString) {

		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : aString.toCharArray()) {
			chars.add(c);
		}

		Collections.reverse(chars);

		String aStringrev = "";
		for (int i = 0; i < chars.size(); i++) {
			aStringrev += chars.get(i);

		}

		return aString.equalsIgnoreCase(aStringrev);
	}

}
