package multithreading;


	class ThreadA extends Thread
	{
		int total=0;
		public void run()
		{
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			this.notify();
		}
	}
	public class DemoWait {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadA b=new ThreadA();
		b.start();
		Thread.sleep(1000);
		//b.join();
		b.join();
		b.wait();
		System.out.println(b.total);
		
	}

}
