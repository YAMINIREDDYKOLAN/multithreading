package capgemini.com.service;

import capgemini.com.bean.Employee;
import capgemini.com.bean.Verification;
import capgemini.com.dao.BGDao;
import capgemini.com.dao.IBGDao;

public class BGService implements IBGService {
		IBGDao bgdao;


		public void documentStatus(Employee d) {
			bgdao=new BGDao();
			bgdao.documentStatus(d);
			
		}


		public void documentStatus1(Verification v) {
			bgdao=new BGDao();
			bgdao.documentStatus1(v);
			
		}


		
		public boolean documentVerification() {
			bgdao=new BGDao();
			boolean b=bgdao.documentVerification();
			return b;
		}
		


		
	}


