//when any operation failed in the created class, 
//then system will note execute
//complete programme and then stops the execution 
//which is know as exception
//handling


public class Example 
{
	public static void main(String args[])
	{
		try
		{
		     int a=10;
		     int count=args.length;
		     if(count==0)
		    	throw new ArithmeticException("Here Denominator is zero ....so please check that");
		    int result=a/count;//system creates ArithmeticException Object
			System.out.println("Result is :"+result);
			
		}
		catch(ArithmeticException ae)
		{
			//System.out.println("comand line arguments are not given here so that Denominator is zero..");
			System.out.println(ae.getMessage());
		}
	}
}


