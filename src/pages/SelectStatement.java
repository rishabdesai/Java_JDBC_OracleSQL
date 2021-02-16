/* SELECT statement  
 */

package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:Xe";
		String username = "root"; // change as per your username
		String password = "root"; // change as per your password
		try {
			// Establish Connection using username and password
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("connected to database");

			// create statement/ preparementStatement/ CollableStatement to execute query
			Statement statement = connection.createStatement();

			// prepare and execute the query
			String sql = "SELECT * FROM EMP9";

			// statement.executeUpdate(sql); //DML : Insert/Update/Delete
			ResultSet rs = statement.executeQuery(sql); // DQL : Select
			// print on console
			while (rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				float sal = rs.getFloat(3);
				int deptno = rs.getInt(4);
				String job = rs.getString(5);
				String mgr = rs.getString(6);

				System.out.printf("%-4s\t%-10s\t%-10.2f\t%-2d\t%-2s\t%-4s\n", empno, ename, sal, deptno, job, mgr);
			}

			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("error!");
			e.printStackTrace();

		}

	}

}
