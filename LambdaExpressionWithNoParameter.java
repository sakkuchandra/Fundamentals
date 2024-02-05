import java.util.ArrayList;
import java.util.List;

interface Cab
{  
    void bookCab();  
    
}  

public class LambdaExpressionWithNoParameter 
{  
	public static void main(String[] args) 
	{  
	    Cab c=()->{    // Cab c=new Cab(){}
	    	System.out.println("Cab Booked");      
	    };  
	    c.bookCab();  
     //}
	
	
	 List<String> list=new ArrayList<String>();  
     list.add("Rick");         
     list.add("Negan");       
     list.add("Daryl");         
     list.add("Glenn");         
     list.add("Carl");                
     list.forEach(          
         // lambda expression        
         (names)->System.out.println(names)         
     );
	}
}  
