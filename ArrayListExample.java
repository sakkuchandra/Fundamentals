import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	ArrayList al;

	public void CreateList()
	{
		al=new ArrayList();    //ArrayList Object created here  
		al.add(10);            //adding integers to arraylist      
		al.add(20); 
		al.add(30);
		al.add(40);              //arraylist is dynamic growable and we can add either similar type of object or disimilar
		al.add("Java");        //it uses autoboxing
		al.add(12.44f);
		al.add(10);
			 
		System.out.println("ArrayList Object:");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());   //displaying values from arraylist
		}
	}
		    
  public static void main(String args[])
  {
   ArrayListExample ae=new ArrayListExample();
   ae.CreateList();
  }
}
