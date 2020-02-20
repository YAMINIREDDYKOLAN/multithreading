package multithreading;

public class Demo extends Thread
{
	public void run()
	{
		{
			for(int i=1;i<=5;i++)
			{
				try
				{
					join();
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

							System.out.println("value of i:"+i);
		
				}
		}	
	}
public static void main(String[] arg) throws InterruptedException
		{
		Demo d=new Demo();//start state
		
		d.start();
		d.join();//blocking a thread
		for(int j=1;j<=5;j++)
		{
		System.out.println("value of j is:"+j);
		
		}
		}
		
}

