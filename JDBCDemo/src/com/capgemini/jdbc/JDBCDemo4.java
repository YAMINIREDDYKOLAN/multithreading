package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading drive class-1
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pooja","pooja");//step2
		CallableStatement st=conn.prepareCall("call hello(?,?)");
		st.setInt(1,100);
		st.setString(2,"yamini");
		st.executeUpdate();
		System.out.println("success");
		
		
		
		
		
	}
	

}
