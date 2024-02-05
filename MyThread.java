
public class MyThread implements Runnable   //Runnable is a predefined interface give in java Language
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		t1.start();
		t2.start();
	}

}
