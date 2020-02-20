package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading drive class-1
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pooja","pooja");//step2
		PreparedStatement pst10=conn.prepareStatement("create table emp12(empid number(5),empname varchar(20))");
        boolean b=pst10.execute();
		 System.out.println("table is created");
		
		
		
		PreparedStatement pst=conn.prepareStatement("insert into emp12 values(?,?)");
		pst.setInt(1, 100);
		pst.setString(2, "yamini");
		int n1=pst.executeUpdate();
		System.out.println(n1+"record is inserted");
		
		PreparedStatement pst1=conn.prepareStatement("insert into emp12 values(?,?)");
		pst1.setInt(1, 101);
		pst1.setString(2, "sweety");
		int n5=pst1.executeUpdate();
		System.out.println(n5+"record is inserted");
		
		PreparedStatement pst7=conn.prepareStatement("insert into emp12 values(?,?)");
		pst7.setInt(1, 102);
		pst7.setString(2, "reddy");
		int n6=pst7.executeUpdate();
		System.out.println(n6+"record is inserted");
		
		
		/*PreparedStatement pst2=conn.prepareStatement("update emp1 set empid=? where empid=?");
		pst2.setInt(1, 102);
		pst2.setString(2,"yamini");
		int n2=pst2.executeUpdate();
		System.out.println(n2+"record is updated");*/
		
		PreparedStatement pst3=conn.prepareStatement("delete from emp12 where empid=?");
		pst3.setInt(1, 101);
		int n3=pst3.executeUpdate();
		System.out.println(n3+"record is deleted");
		
		PreparedStatement pst4=conn.prepareStatement("select * from emp12");
		ResultSet rs=pst4.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		 conn.close();
	}

}
