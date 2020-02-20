package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading drive class-1
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pooja","pooja");//step2
		Statement st=conn.createStatement();//create statement-3
		ResultSet rs=st.executeQuery("select * from csek");
		while(rs.next())

	   {
			System.out.println(rs.getInt(1)+""+rs.getString(2));
			}
	   }
}
