package main;

import java.util.ArrayList;
import java.util.Scanner;

import beansAreBack.merchantBean;
import database.SQLconnection;

public class SQL_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// scanner is also back
		System.out.print("Search?");
		Scanner scanner = new Scanner(System.in);
		String toSend = scanner.nextLine();

		// String toSend = "sys";

		ArrayList<merchantBean> merchants = new ArrayList<merchantBean>();

		// check if connection is open?
		if (SQLconnection.connectSQL()) {
			// send the string
			merchants = SQLconnection.stateSQL(toSend, merchants);
		}

		// now we can deal with them all over here
		for (int i = 0; i < merchants.size(); i++) {
			System.out.print(merchants.get(i).getMerchantName());
			System.out.print(" ");
			System.out.println(merchants.get(i).getMerchantPhone());
		}
		scanner.close();

	}

}
