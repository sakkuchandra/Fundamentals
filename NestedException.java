import java.io.*;

public class NestedException 
{
	  void m1() throws IOException
	  { 
	    throw new IOException("device error"); 
	  } 
	  void n1() throws IOException
	  { 
	    m1(); 
	  } 
	  void p1() 
	  { 
	    try 
	    { 
	      n1(); 
	    } 
	    catch(Exception e) 
	    { 
	      System.out.println(e.getMessage()); 
	    } 
	  } 
	  public static void main(String args[]) 
	  { 
		  NestedException obj = new NestedException(); 
	      obj.p1(); 
	  } 

}
