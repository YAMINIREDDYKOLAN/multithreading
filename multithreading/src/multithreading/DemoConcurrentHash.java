package multithreading;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHash {

	public static void main(String[] args) {
		
				
		ConcurrentHashMap h=new ConcurrentHashMap();
				h.put(100, "a");
				h.put(103, "b");
				h.put(105, "c");
				h.put(101, "d");
				h.putIfAbsent(102,"d" );
				h.putIfAbsent(100,"d" );//if key already exists then repetation will be ignored
				//h.replace(100, "yamini", "mini");
				System.out.println(h);
				
			}

	

		

	}


