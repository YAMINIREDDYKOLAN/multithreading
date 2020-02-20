package multithreading;

class ThreadA1 extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread starts");
			for(int i=1;i<=100;i++)
			{
				total=total+1;
			}
			System.out.println("child giving notification");
			this.notify();
		}
	}
}

public class DemoWait1 {

	public static void main(String[] args) throws Exception {
		ThreadA1 a=new ThreadA1();
		a.start();
		synchronized(a)
		{
			System.out.println("main thread callng wait");
			a.wait();
			System.out.println("main thread got notfication");
			System.out.println(a.total);
		}
		
	}

}
