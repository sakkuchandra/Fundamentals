import java.util.Scanner;

public class ReadingDataFromKb 
{
	Scanner s;
	String name;
	int id;
	
	public void CreateStream()
	{
		try
		{
			s=new Scanner(System.in);
			System.out.println("Enter the name");
			name=s.next();
			System.out.println("Ednter the Id");
			id=s.nextInt();
			System.out.println("Given Name is :"+name);
			System.out.println("Given Id is :"+id);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String args[])
	{
		ReadingDataFromKb kb=new ReadingDataFromKb();
		kb.CreateStream();
	}

}
