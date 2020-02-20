package capgemini.com.background;
import java.util.Scanner;

import javax.xml.crypto.Data;

import capgemini.com.service.BackgroundService;
import java.sql.SQLException;
public class BackgroungUI {

	public static void main(String[] args)  {
		
		int requestid;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the requestid");
		requestid=sc.nextInt();
		
		System.out.println("enter the requestStartDate");
		String requestStartDate=sc.next();
		
		
		System.out.println("enter the requestEndDate");
		String requestEndDate=sc.next();
		
		System.out.println("enter the status report");
		String status=sc.next();
		
		                              
		                                                                               
		BackgroundService bookService=new BackgroundService();
		int updateCount=bookService.addEmployee(requestid,requestStartDate,requestEndDate,status);
		 
        System.out.println(updateCount);
		
				

	}

}
