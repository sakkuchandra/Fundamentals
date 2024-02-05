import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample2 
{
	File f1,f2;
	DataInputStream dis;
	FileInputStream fis;
	FileOutputStream fos;
	DataOutputStream dos;
	String fname,lname;
	int id,sal,age;
	StringBuffer sb=new StringBuffer();
	int i;
	
   public void ReadDataFromFile()throws Exception
   {
	  
		   
		   
		   CompletableFuture<String>cf=CompletableFuture.supplyAsync(()->
		   {
			   try
			   {
				   f1=new File("d:\\student.dat");
				   f2=new File("d:\\student1.dat");
				   fis=new FileInputStream(f1);
				   dis=new DataInputStream(fis);
				   BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		   		   fos = new FileOutputStream(f2);
		   		   dos = new DataOutputStream(new BufferedOutputStream(fos));
		   
		   		   String data;
		   		   while ((data = br.readLine()) != null)   
		           {
		   			   dos.writeChars(data);
		   			   dos.flush();
		   			   String result[]=data.split(" ");
		   			   for(i=0;i<result.length;i++)
		   			   {
		   				   if(i==0||i==1)
		   				   {
		   					   sb.append(result[i]+"  ");
		   				   }
		   				   System.out.print(result[i]+" "); 
		   			   System.out.println();
		   			   }
		           }
		    
			   }
			   catch(Exception ex)
			   {
				   System.out.println(ex.getMessage());
			   }
			   return sb.toString();
		   });
	   System.out.println(cf.get());
	   
   }
   public static void main(String args[])throws Exception
   {
	   CompletableFutureExample2 cf=new CompletableFutureExample2();
	   cf.ReadDataFromFile();
   }
}
