package capgemini.com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import capgemini.com.bean.BackgroundBean;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.Date;
import java.time.LocalDate;

public class BackgroundDAO {
	
	public int addBackground(BackgroundBean backgroundBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
			con=BackgroungDB.getConnection();
			pst=con.prepareStatement("insert into pretty values(?,?,?,?)");
			
			pst.setInt(1,backgroundBean.getRequestid());
			pst.setString(2,backgroundBean.getRequestStartDate());
			pst.setString(3,backgroundBean.getRequestEndDate());
			pst.setString(4,backgroundBean.getStatus());
			
			
			
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}


