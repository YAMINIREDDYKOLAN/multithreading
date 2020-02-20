package multithreading;

public class Live extends Thread {
	public void run()
	{
		
	for(int i=0;i<=3;i++)
	{
	System.out.println("value of i is:"+i);
	System.out.println(Thread.currentThread().isAlive());
		
	}
	}

public static void main(String[] args) throws InterruptedException {
		
		Live l=new Live();
		l.run();
		for(int j=0;j<=3;j++)
		{
		System.out.println("value of j is:"+j);
		l.join();
		
			System.out.println(Thread.currentThread().isAlive());
			
		}
		
	
}}
