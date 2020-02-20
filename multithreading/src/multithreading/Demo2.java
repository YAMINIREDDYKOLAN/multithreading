package multithreading;

public class Demo2 extends Thread {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			
		System.out.println("i value:"+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int j=0;j<=5;j++)
		{
		System.out.println("j value:"+j);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int k=0;k<=4;k++)
		{
		System.out.println("k value:"+k);	
		
		
		}
		}
	

public static void main(String[] args) {
	Demo2 d2=new Demo2();
	d2.run();
		
	}

}
