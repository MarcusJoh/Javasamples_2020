package datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.merchantBean;

public class SQLconnection {

	static Connection conn = null;
	static PreparedStatement stmt = null;
	static ResultSet rs = null;

	public static boolean connectSQL() {

		try {

			// driver setup
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (Exception ex) {
			System.out.println("Exception Driver " + ex.getMessage());
			return false;
		}

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc_main", DatabaseLogin.getuName(),
					DatabaseLogin.getuPass());

			return true;

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}

	}

	public static ArrayList<merchantBean> stateSQL(String merchantName, ArrayList<merchantBean> merchants) {

		try {
			String requestQuery = "SELECT `merchants_name`, `merchants_phone` FROM `merchants` WHERE `merchants_name` LIKE ?";

			System.out.println(requestQuery);

			stmt = conn.prepareStatement(requestQuery);

			stmt.setString(1, "%" + merchantName + "%");

			rs = stmt.executeQuery();

			while (rs.next()) {

				merchantBean merchant = new merchantBean();

				merchant.setMerchantName(rs.getString("merchants_name"));
				merchant.setMerchantPhone(rs.getString("merchants_phone"));

				merchants.add(merchant);
			}
			rs.close();
			conn.endRequest();
			conn.close();

			return merchants;

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return null;

	}

}
