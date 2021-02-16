/*  simplifying the code using separate class for connection (DbUtils)
 * 
 */

package pages;

import java.sql.Connection;
import utils.DbUtils2;

public class BasicJDBCconnectionOption4 {

	public static void main(String[] args) {
		Connection connection = null;

		try {
			connection = DbUtils2.getConnection();
			System.out.println("connected to database");

		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}

}
