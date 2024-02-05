public class staticvariable 
{
	private String name;
	private int regno;
	private final static String college="JNTU";
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRegno() 
	{
		return regno;
	}
	public void setRegno(int regno) 
	{
		this.regno = regno;
	}
	public String getCollege() 
	{
		return college;
	}
	/*
	public void setCollege(String college) 
	{
		this.college = college;
	}
	*/
	public static void main(String args[])
	{
		staticvariable s1=new staticvariable();
		s1.setName("abc");
		s1.setRegno(10);
		
		
		staticvariable s2=new staticvariable();
		s2.setName("xyz");
		s2.setRegno(20);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRegno());
		System.out.println(s1.getCollege());
		
		
		System.out.println(s2.getName());
		System.out.println(s2.getRegno());
		System.out.println(s2.getCollege());
		
		
	}
	

}
