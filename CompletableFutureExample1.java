import java.util.Arrays;  
import java.util.List;  
import java.util.concurrent.CompletableFuture;  
public class CompletableFutureExample1   
{  
	public static void main(String[] args)   
	{  
		try
		{
			CompletableFuture<Void> cf = CompletableFuture.runAsync(()->{System.out.println("Task executing asynchronously");
			});
			System.out.println("Value- " + cf.get());

			CompletableFuture cf1 = CompletableFuture.supplyAsync(()->{
			return "Hello";
			});
			System.out.println("Value- " + cf1.get());
		}
		catch(Exception ex)
		{
	
		}

}

}