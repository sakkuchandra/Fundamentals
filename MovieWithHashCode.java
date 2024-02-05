
public class MovieWithHashCode
{
	private String name, actor;
	private int releaseYr;
	 
	
	    @Override
	
	    public boolean equals(Object o) 
	    {
	        
	    	MovieWithHashCode m = (MovieWithHashCode) o;
	    	 System.out.println("equals Method Executed"+m.releaseYr);
	        return m.actor.equals(this.actor) && m.name.equals(this.name) && m.releaseYr == this.releaseYr;
	
	    }
	
	 
	
	    @Override
	
	   public int hashCode() 
	    {
	    	System.out.println("Hashcode:"+actor.hashCode() +"   "+ name.hashCode() +"   "+ releaseYr);
	        return actor.hashCode() + name.hashCode() + releaseYr;
	
	    }
	
	 
	
	    public String getName() 
	    {
	
	        return name;
	
	    }
	
	 
	
	    public void setName(String name) 
	    {
	
	        this.name = name;
	
	    }
	
	 
	
	    public String getActor() 
	    {
	
	        return actor;
	
	    }
	
	 
	
	    public void setActor(String actor) 
	    {
	
	        this.actor = actor;
	
	    }
	
	 
	
	    public int getReleaseYr() 
	    {
	
	        return releaseYr;
	
	    }
	
	 
	
	    public void setReleaseYr(int releaseYr) 
	    {
	
	        this.releaseYr = releaseYr;
	
	    }
	
	 
	
	    


}
