package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// driver setup
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception ex) {
			// handle the error
			System.out.println("Exception Driver: " + ex.getMessage());
		}

		Connection conn = null;

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo?serverTimezone=UTC", "root", "");

			String requestQuery = "SELECT * FROM `animal`";

			PreparedStatement myState = conn.prepareStatement(requestQuery);
			ResultSet rs = myState.executeQuery();
			// ResultSet return
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

			}

			conn.close();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}

	}

}
