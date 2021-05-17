package main;

import java.util.ArrayList;
import java.util.Scanner;

import database.SQLconnection;

public class SQL_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// scanner is also back

		Scanner scanner = new Scanner(System.in);
		System.out.print("new monkey?");
		String monkey = scanner.nextLine();
		System.out.print("into cage");
		String cage = scanner.nextLine();

//		String monkey = "testmonkey";
//		String cage = "nikolas cage";

		// check if connection is open?
		if (SQLconnection.connectSQL()) {
			// send the string
			SQLconnection.stateSQL(monkey, cage);
		}

		scanner.close();
	}

}
