import java.util.Optional;

public class OptionalExample 
{
	public void OptionalWithCheckNullExample()
	{
		String[] str = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }
	}
	public void OptionalWithIsPresentExample()
	{
		//Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");        
        //Optional.empty() creates an empty Optional object        
        Optional<String> nothing = Optional.empty();
        /* isPresent() method: Checks whether the given Optional         
         * Object is empty or not.         
         */        
        if (GOT.isPresent()) {          
           System.out.println("Watching Game of Thrones");       
        } 
        else {            
           System.out.println("I am getting Bored");      
        }
        /* ifPresent() method: It executes only if the given Optional         
         * object is non-empty.         
         */        
        //This will print as the GOT is non-empty        
        GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
        //This will not print as the nothing is empty        
        nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
	}
	public void OptionalWithorElseExample()
	{
		//Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");        
        //Optional.empty() creates an empty Optional object        
        Optional<String> nothing = Optional.empty();

        //orElse() method
        System.out.println(GOT.orElse("Default Value")); 
        System.out.println(nothing.orElse("Default Value")); 

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value")); 
        System.out.println(nothing.orElseGet(() -> "Default Value")); 
	}
	public void OptionalWithMapExample()
	{
		//Creating Optional object from a String       
	      Optional<String> GOT = Optional.of("Game of Thrones");       
	      //Optional.empty() creates an empty Optional object       
	      Optional<String> nothing = Optional.empty();
	      System.out.println(GOT.map(String::toLowerCase));        
	      System.out.println(nothing.map(String::toLowerCase));
	      Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));        
	      System.out.println("Value of Optional object"+anotherOptional);        
	      System.out.println("Optional.map: "             
	          +anotherOptional.map(gender -> gender.map(String::toUpperCase)));        
	      //Optional<Optional<String>>    -> flatMap -> Optional<String>        
	      System.out.println("Optional.flatMap: "            
	          +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
	}
	public void OptionalWithFilterExample()
	{
		//Creating Optional object from a String       
	      Optional<String> GOT = Optional.of("Game of Thrones");              
	      /* Filter returns an empty Optional instance if the output doesn't         
	       * contain any value, else it returns the Optional object of the          
	       * given value.         
	       */        
	      System.out.println(GOT.filter(s -> s.equals("GAME OF THRONES")));         
	      System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));
	}
	public static void main(String argv[])
	{
		OptionalExample oe=new OptionalExample();
		oe.OptionalWithCheckNullExample();
		oe.OptionalWithIsPresentExample();
		oe.OptionalWithorElseExample();
		oe.OptionalWithMapExample();
		oe.OptionalWithFilterExample();
	}

}
