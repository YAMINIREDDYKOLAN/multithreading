package multithreading;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentThreadSafe extends Thread {
 static  ConcurrentHashMap m=new  ConcurrentHashMap();
 public void run()
 {
	
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("child thread is updating");
		 m.put(103,"a");
		 
	
 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            m.put(101,"a");
            m.put(102,"a");
            ConcurrentThreadSafe t=new ConcurrentThreadSafe();
            t.start();
            Set s1=m.keySet();
            Iterator itr=s1.iterator();
            while(itr.hasNext())
            {
            	Integer l1=(Integer)itr.next();
            	System.out.println("main thread iterating and current entry is"+l1+""+m.get(l1));
            	Thread.sleep(3000);
            	
            }
            System.out.println(m);
	}

}
