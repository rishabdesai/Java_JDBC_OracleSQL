/*  This program makes connection with oracle database (express edition 11)
 *  download oracle jdbc client from :
 *  https://www.oracle.com/in/database/technologies/appdev/jdbc-downloads.html
 *  right click project name > build Path> configure build path > Libraries tab >
 *  class path > select add-external-jars button > add jar file (ex. ojdbc10.jar) >
 *  run the program.
 * 
 */

package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicJDBCconnection {
	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:Xe";
		String username = "root"; // change as per your username
		String password = "root"; // change as per your password

		try {
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("connected to database");
		} catch (SQLException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}


}
