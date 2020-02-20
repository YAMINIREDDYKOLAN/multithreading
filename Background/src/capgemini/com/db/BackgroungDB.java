package capgemini.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BackgroungDB {

	public static   Connection  getConnection() throws ClassNotFoundException, SQLException
	{
		String drivername="oracle.jdbc.driver.OracleDriver";
			Class.forName(drivername);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","yamini1234","yamini1234");
			
			return con;
		}

	
	

	}

