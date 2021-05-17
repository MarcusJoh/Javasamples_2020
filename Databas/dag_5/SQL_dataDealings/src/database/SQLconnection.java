package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beansAreBack.merchantBean;

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
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc_main?serverTimezone=UTC",
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

	public static ArrayList<merchantBean> stateSQL(String merchantName, ArrayList<merchantBean> merchants) {

		// test a query
		try {
			String requestQuery = "SELECT `merchants_name`,`merchants_phone` FROM `merchants` WHERE `merchants_name` LIKE ?";
			// print the Query to check if its right
			System.out.println(requestQuery);
			stmt = conn.prepareStatement(requestQuery);

			stmt.setString(1, "%" + merchantName + "%");

			rs = stmt.executeQuery();
			// ResultSet return
			while (rs.next()) {

				// print them
				//System.out.println(rs.getString("merchants_phone") + "  " + rs.getString("merchants_name"));

				// set up the bean
				merchantBean merchant = new merchantBean();
				// add the merchants_name
				merchant.setMerchantName(rs.getString("merchants_name"));
				
				// add the merchants_phone

				merchant.setMerchantPhone(rs.getString("merchants_phone"));
				
				
				// and add the bean into the arreylist
				merchants.add(merchant);
			}
			// close them before doing anything else
			rs.close();
			conn.endRequest();
			conn.close();
			// always make sure to close this stuff

			// return the results after the ResultSet is done and closed
			return merchants;

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}
		return null;

	}
}
