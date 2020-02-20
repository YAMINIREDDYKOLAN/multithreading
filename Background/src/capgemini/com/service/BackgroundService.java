package capgemini.com.service;



import capgemini.com.bean.BackgroundBean;
import capgemini.com.db.BackgroundDAO;

public class BackgroundService {
	
	
		public int addEmployee(int requestid,String requestStartDate,String requestEndDate,String status) 
		{
			
		
		  String valid="ok"; 
		  if(status==valid) 
		  { System.out.println("valid document");
		  } 
		  else if(status!=valid) { System.out.println("invalid Document"); } 
		  else {
		  System.out.println("upload document");
		  }
		 
		    BackgroundDAO backgroundDAO=new BackgroundDAO();
		    BackgroundBean backgroundBean=new BackgroundBean();
			
			backgroundBean.setRequestid(requestid);
	        backgroundBean.setRequestStartDate(requestStartDate);
	        backgroundBean.setRequestEndDate(requestEndDate);
			backgroundBean.setStatus(status);
			
			int updateResult=0;
			 
			try
			{
				updateResult=backgroundDAO.addBackground(backgroundBean);	
				return updateResult;
			}
			catch(Exception e)
			{
			System.out.println("exeception resolved");	
			}
			 
				
			return 0;
		     
			 
			
		}
}

		