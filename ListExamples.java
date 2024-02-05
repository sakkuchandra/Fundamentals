import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExamples 
{
	LinkedList list;   //List type of classess
	ArrayList al;
	Vector v;
	
	 
	 public void ListWithIntegersExample()   //this is a Method we created
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
	    
		public void ListWithStringsExample()
		{
			al=new ArrayList(); 
			al.add("Mango");       //adding string values to arraylist
			al.add("Apple");    
			al.add("Banana");    
			al.add("Grapes");    
			  
			  Iterator itr=al.iterator();  
			  while(itr.hasNext())
			  {  
			   System.out.println(itr.next());  
			  }  
		}
		public void ArrayListWithUserdefinedObjects() 
		{
		   ArrayList <Book>al=new ArrayList<Book>();
		   Book b1=new Book("book1");
		   Book b2=new Book("book2");
		   al.add(b1);
		   al.add(b2);
		   Iterator i=al.iterator();
		   while(i.hasNext())
		   {
			   Book b=(Book)i.next();
			   System.out.println(b.getTitle());
		   }
		}
		public void ShowLinkedList()
		{
			list=new LinkedList();
			list.add(10);       //adding integers to linkedlist
			list.add(20);
			list.add("java");
			list.add(10.2);
			list.add(10);
			
			
             System.out.println("Linked List:");
	         Iterator i=list.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		public void CreateVector()
		{
			v=new Vector();     //vector is synchronized
			v.add(10);       //adding integers to vectors
			v.add(20);
			v.add(30);
			v.add(20);
			v.add("java");  
			v.add(10.2f);
			
			System.out.println("Vector Object:");
			Iterator i=v.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		public static void main(String args[])
		{
			ListExamples le=new ListExamples();
			//le.ListWithIntegersExample();
			//le.ListWithStringsExample();
			le.ArrayListWithUserdefinedObjects();
			//le.ShowLinkedList();
			//le.CreateVector();

		}


}

 