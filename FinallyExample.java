
public class FinallyExample 
{
	public static void main(String[] args)
	  {
	    int a[] = new int[2];
	    
	    //System.out.println("out of try");
	    
	    try
	    {
	      System.out.println("Access invalid element"+ a[0]);
	      /* the above statement will throw ArrayIndexOutOfBoundException */
	    }
	    catch(ArrayIndexOutOfBoundsException ai)
	    {
	    	System.out.println("Exception generated here");
	    }
	    finally
	    {
	      System.out.println("finally is always executed.");
	    }
	  }

}
