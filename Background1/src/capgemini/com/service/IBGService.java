package capgemini.com.service;

import capgemini.com.bean.Employee;
import capgemini.com.bean.Verification;

public interface IBGService {

		void documentStatus(Employee d);

		void documentStatus1(Verification v);

		boolean documentVerification();
		
	}

