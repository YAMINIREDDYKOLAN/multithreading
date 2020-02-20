package capgemini.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import capgemini.com.bean.Employee;
import capgemini.com.bean.Verification;
import capgemini.com.db.DB;

public class BGDao implements IBGDao{
		Scanner sc=new Scanner(System.in);
			
			
		public void documentStatus(Employee d) {
				try {
					Connection con=DB.getConnection();
					PreparedStatement pst=con.prepareStatement("insert into document values(?,?,?,?,?)");
					pst.setInt(1, d.getEmpId());
					pst.setString(2, d.getEmpName());
					pst.setInt(3, d.getDocId());
					pst.setString(4, d.getDocType());
					pst.setString(5, d.getDocData());
					pst.executeUpdate();
					
				}catch (SQLException e1) {
						e1.printStackTrace();
				}
				
		}
		@Override
		public void documentStatus1(Verification v) {
			
			try{
				Connection con=DB.getConnection();
				System.out.println("insert verification details about employee");
			PreparedStatement pst1=con.prepareStatement("insert into verificationDetails values(?,?,?,?)");
			pst1.setInt(1, v.getVerId());
			pst1.setString(2, v.getStartDate());
			pst1.setString(3, v.getEndDate());
			pst1.setString(4,v.getStatus());
			pst1.execute();
		} catch (SQLException e1) {

			e1.printStackTrace();
		} 
		}
		@Override
		public boolean documentVerification() {
			boolean flag = false;
			     Employee d=new Employee();
				try {
					Connection con=DB.getConnection();
					System.out.println();
					PreparedStatement pst1=con.prepareStatement("select empid,empname,docid,doctype,docdata from document where empid =? and empname=? and docid=? and doctype=? and docdata=? ");
					pst1.setInt(1, sc.nextInt());
					pst1.setString(2, sc.next());
					pst1.setInt(3, sc.nextInt());
					pst1.setString(4, sc.next());
					pst1.setString(5, sc.next());
					//pst1.setInt(6, sc.nextInt());
					ResultSet rs=pst1.executeQuery();
					if(rs.next())
					{
							flag=true;
					}
						else
							flag=false;
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			return flag;
		}
		


		}



