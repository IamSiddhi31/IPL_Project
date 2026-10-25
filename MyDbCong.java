package jdbc_ipl_oct_23;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDbCong {

	public static Connection getSqlConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 String url = "jdbc:mysql://localhost:3307/jdbc_1340?createDatabaseIfNotExist=true";
			 String username = "root";
			 String pass = "root";
			 
			 Connection con = DriverManager.getConnection(url, username, pass);
			 
			 return con;

		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}	
}

