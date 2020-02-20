package multithreading;

public class Demo1 extends Thread{
	public void run()
	{
		
		for(int i=0;i<=3;i++)
			{
			System.out.println("value of i is:"+i);
			}
	}
public static void main(String[] arg) throws InterruptedException
{
	Demo1 d=new Demo1();//start state
	
	d.start();//runnable
	d.join();
	
	for(int j=0;j<=3;j++)
		{
			System.out.println("value of j:"+j);
			
		}
}
}
