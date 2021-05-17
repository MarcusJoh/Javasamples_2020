package main;

import database.SQLconnection;

public class SQL_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// some thing to send
		String toSend = "Wine inc.";

		// check if connection is open?
		if (SQLconnection.connectSQL()) {
			// send the string
			SQLconnection.stateSQL(toSend);
		}

	}

}
