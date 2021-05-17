package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLconnection {

	// set up the connection as static
	// instances can be done and are done for nonlocal projects with many users
	static Connection conn = null;
	static PreparedStatement stmt = null;
	static ResultSet rs = null;

	public static boolean connectSQL() {

		try {

			// driver setup
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception ex) {
			// handle the error
			System.out.println("Exception Driver: " + ex);
			return false;
		}

		try {

			// keep the pass and username in its own file
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?serverTimezone=UTC",
					DatabaseLogin.getuName(), DatabaseLogin.getuPass());
			return true;

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}

	}

	public static boolean stateSQL(String email, String pass) {

		// test a query
		try {
			String requestQuery = "SELECT login_email FROM login WHERE login_email = ? and login_password = ?";

			// print the Query to check if its right
			System.out.println(requestQuery);
			stmt = conn.prepareStatement(requestQuery);

			stmt.setString(1, email);
			stmt.setString(2, pass);

			rs = stmt.executeQuery();

			boolean correctPass = false;
			// ResultSet return
			while (rs.next()) {

				// print them
				System.out.println(rs.getString("login_email"));
				correctPass = true;

			}
			// close them before doing anything else
			rs.close();
			conn.endRequest();
			conn.close();
			// always make sure to close this stuff

			return correctPass;
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}
		return false;

	}
}
