public class MyExample 
{

	public static void main(String[] args) 
	{
	    try
	    {
		    int a=10;
	    	int count=args.length;
	    	
	   
	    	if(count==0)
	    		throw new ArithmeticException("Here Denominator value becomes zero....so that programme execution stopped here");
	    	int result=a/count;
	    	System.out.println("Result is "+result);
	    }
	    catch(ArithmeticException ae)
	    {
	      System.out.println(ae.getMessage());
	       //System.out.println("Denominator is zero");
	    }
	    //finally
	    //{
	    	//System.out.println("Alwyas executes");
	    //}
	   
		}

}
