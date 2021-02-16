package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtils2 {
	static Properties p;
	static {
		try {
			InputStream inputStream = new FileInputStream(new File("Config.properties"));
			p = new Properties();
			p.load(inputStream);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection( ) throws Exception {
		System.out.println("inside getConnection()");
		return DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));
	}
}
