public class SynchronizedBlock implements Runnable
{
	public void run()
	{
		synchronized(this) 
		{
			for(int i=0;i<10;i++)
		    {
			   System.out.println(i);
			   try
			   {
			     Thread.sleep(100);
			   }
			   catch(Exception ex)
			   {
				
			   }
		     }
		 }
	}
	
	public static void main(String args[])
	{
		SynchronizedBlock sb=new SynchronizedBlock();
		Thread t1=new Thread(sb);
		Thread t2=new Thread(sb);
		t1.start();
		t2.start();
		
	}

}

