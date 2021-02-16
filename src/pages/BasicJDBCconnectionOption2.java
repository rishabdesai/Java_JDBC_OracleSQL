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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJDBCconnectionOption2 {
	
	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "root";
	public static final String PASSWORD = "root";
	
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connected to database");
			
			
		} catch (SQLException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}


}
