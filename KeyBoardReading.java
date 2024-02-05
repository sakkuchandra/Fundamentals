import java.util.Scanner;

public class KeyBoardReading 
{
	Scanner s;
	String name,gender;
	int id;
	
	public void CreateObject()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.next();  
		System.out.println("Enter the id");
		id=s.nextInt();
		System.out.println("Enter the gender");
		gender=s.next();
		System.out.println("Name is :"+name);
		System.out.println("Gender is :"+gender);
		System.out.println("Id is:"+id);
	}
    public static void main(String args[])
    {
         KeyBoardReading kbr=new KeyBoardReading();
         kbr.CreateObject();
    }
}
