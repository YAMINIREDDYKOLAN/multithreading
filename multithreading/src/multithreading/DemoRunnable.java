package multithreading;

public class DemoRunnable implements Runnable
{
public void run()
{
	for(int i=0;i<=10;i++) {
		System.out.println("i value is:"+i);
	}
}

	public static void main(String[] args) {
		
		DemoRunnable d=new DemoRunnable();
		Thread t=new Thread(d);
		t.start();
		for(int j=0;j<=5;j++) {
			System.out.println("j value is:"+j);
		}
		

	}

}