package capgemini.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
		public static Connection getConnection()
		{Connection con=null;
			
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
						con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","kolan1234","yamini1234");
				} catch (ClassNotFoundException|SQLException e) {
					e.printStackTrace();
				} 
				
			return con;
				
				
		}
		}

	
			
	
	


