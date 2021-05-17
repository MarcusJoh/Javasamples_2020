package main;

import java.util.Scanner;

import database.SQLconnection;

public class SQL_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("email?");
		String email = scanner.nextLine();
		System.out.print("pass");
		String pass = scanner.nextLine();

		// check if connection is open?
		if (SQLconnection.connectSQL()) {
			// send the strings
			if (SQLconnection.stateSQL(email, pass)) {

				System.out.print("login success");
			}

		}

	}

}
