/*  simplifying the code using separate class for connection (DbUtils.java)
 * 
 */

package pages;

import java.sql.Connection;
import utils.DbUtils;

public class BasicJDBCconnectionOption3 {

	public static void main(String[] args) {
		Connection connection = null;

		try {
			connection = DbUtils.getConnection();
			System.out.println("connected to database");

		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}

}
