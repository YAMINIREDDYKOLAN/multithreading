package capgemini.com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

import capgemini.com.bean.Employee;
import capgemini.com.bean.Verification;
import capgemini.com.service.BGService;
import capgemini.com.service.IBGService;

public class BGVerification {

	public static void main(String[] args) throws Exception{
	   
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int option=0;
		do{
			
			System.out.println(" VERIFICATION");
			System.out.println("1.Employee SignUp");
			System.out.println("2.verification");
			System.out.println("3.Exit");
			
			
			IBGService iservice=new BGService();
		System.out.println("Enter the option:");
		option=Integer.parseInt(sc.readLine());
		switch(option)
		{
		case 1:
		{
			
			Verification v=new Verification();
			Employee d=new Employee();
			System.out.println("enter Employee id");
			int id=Integer.parseInt(sc.readLine());
			d.setEmpId(id);
			System.out.println("enter Employee Name");
			d.setEmpName(sc.readLine());
			System.out.println("enter document ID");
			int did=Integer.parseInt(sc.readLine());
			d.setDocId(did);
			System.out.println("enter document type");
			d.setDocType(sc.readLine());
			System.out.println("enter document data");
			d.setDocData(sc.readLine());
			System.out.println("table is created");
			//d.setVd(v);
			iservice.documentStatus(d);
			
			break;
		}
		case 2:
		{
			System.out.println("enter empid,empname,docid,doctype,docdata");
			boolean r=iservice.documentVerification();
			if(r==true)
			{
				
				System.out.println("login sucessfull");
			System.out.println("enter the verification details");
				@SuppressWarnings("unused")			
					/*
					 * SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY");
					 * System.out.println("enter Start Date the give format mm-dd-yyyy"); String
					 * date1=sc.readLine();
					 * System.out.println("enter End date the given format mm-dd-yyyy"); String
					 * date2=sc.readLine();
					 */
			Verification v=new Verification();
			System.out.println("enter the id");
			int vid=Integer.parseInt(sc.readLine());
			v.setVerId(vid);
			System.out.println("enter Start Date the give format mm-dd-yyyy");
			v.setStartDate(sc.readLine());
			System.out.println("enter end Date the give format mm-dd-yyyy");
			v.setEndDate(sc.readLine());
			System.out.println("enter ");
			v.setStatus(sc.readLine());
			iservice.documentStatus1(v);
			break;
			
			}
			else
			{
				System.out.println("login unsucessfull");
			}
		  }
		case 3:
		{
			System.out.println("exit");
			//System.exit(0);
			break;
			
		}
		}
		
	}while(option<=3);
	}
}
