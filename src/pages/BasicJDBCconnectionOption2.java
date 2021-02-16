/*  option-2
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
