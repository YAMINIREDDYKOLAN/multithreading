package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading drive class-1
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pooja","pooja");//step2
		Statement st=conn.createStatement();//create statement-3
		boolean b=st.execute("create table ece29(aid number(10),aname varchar(20))");//4
		System.out.println("table is created");
		
		int n=st.executeUpdate("insert into ece29 values(100,'yamini')");
		System.out.println(n+"inserted into table");
		int n2=st.executeUpdate("insert into ece29 values(102,'yam')");
		System.out.println(n2+"inserted into table");
		int n1=st.executeUpdate("insert into ece29 values(101,'mini')");
		System.out.println(n1+"inserted into table");
		
		int n3=st.executeUpdate("delete from ece29 where aid=100");
		System.out.println(n3+"delete table");
		
		//System.out.println(n+"inserted into table");
		//boolean  st.execute();
				//int st.executeUpdate("insert into emp1 values
				
		conn.close();//5
		
	}

}
