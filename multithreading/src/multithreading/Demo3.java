package multithreading;

public class Demo3 {
	public void run()
	
	{
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				Thread.currentThread().setName("ch1");
				System.out.println(Thread.currentThread());
				
				Thread.currentThread().setPriority(7);
				System.out.println(Thread.currentThread().getPriority());
				System.out.println("value of i is:"+i);
			
		
	   }
		for(int j=0;j<3;j++)
		{
			
				Thread.currentThread().setName("ch2");
				System.out.println(Thread.currentThread());
				System.out.println("value of j is:"+j);
			
		
	   }
	}
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo3 d3=new Demo3();
		//d3.start();
		d3.run();	
		for(int k=0;k<3;k++)
		{
			
				System.out.println(Thread.currentThread());
				System.out.println("value of k is:"+k);
		
	   }

}



	private void start() {
		
	}
}


	