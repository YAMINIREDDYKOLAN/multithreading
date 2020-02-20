package multithreading;

import java.util.HashMap;

public class DemoConHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h=new HashMap();
		h.put(100, "a");
		h.put(103, "b");
		h.put(105, "c");
		h.put(101, "d");
		h.putIfAbsent(102,"d" );
		//h.replace(100, "yamini", "mini");
		System.out.println(h);
		
	}

}
