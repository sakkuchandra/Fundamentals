import java.util.HashMap;

public class HashMapDemoWithHashCode 
{
	
	public static void main(String[] args) 
	{
	
		 
	
		MovieWithHashCode m = new MovieWithHashCode();
	
		        m.setActor("Akshay");
	
		        m.setName("Thank You");
	
		        m.setReleaseYr(2011);
	
		 
	
		        MovieWithHashCode m1 = new MovieWithHashCode();
	
		        m1.setActor("Akshay");
	
		        m1.setName("Khiladi");
	
		        m1.setReleaseYr(1993);
	
		 
	
		        MovieWithHashCode m2 = new MovieWithHashCode();
	
		        m2.setActor("Akshay");
	
		        m2.setName("Taskvir");
	
		        m2.setReleaseYr(2010);
	
		 
	
		        MovieWithHashCode m3 = new MovieWithHashCode();
	
		        m3.setActor("Akshay");
	
		        m3.setName("Taskvir");
	
		        m3.setReleaseYr(2010);
	
		 
	
		        HashMap<MovieWithHashCode, String> map = new HashMap<MovieWithHashCode, String>();
	
		        map.put(m, "ThankYou");
	
		        map.put(m1, "Khiladi");
	
		        map.put(m2, "Tasvir");
	
		        map.put(m3, "Duplicate Tasvir");
	
		 
	
		        // Iterate over HashMap
	
		        for (MovieWithHashCode mm : map.keySet()) {
	
		            System.out.println(map.get(mm).toString());
	
		        }
	
		 
	
		        MovieWithHashCode m4 = new MovieWithHashCode();
	
		        m4.setActor("Akshay");
	
		        m4.setName("Taskvir");
	
		        m4.setReleaseYr(2010);
	
		 
	
		        if (map.get(m4) == null) 
		        {
	
		            System.out.println("----------------");
	
		            System.out.println("Object not found");
	
		            System.out.println("----------------");
	
		        } 
		        else
		        {
	
		            System.out.println("----------------");
	
		            System.out.println(map.get(m4).toString());
	
		            System.out.println("----------------");
	
		        }
	
		    }
}
