public class Circle 
{
	private double radius;
	private final double pi=3.14;
	
	public void setRadius(double r)
	{
		radius=r;
		//radius=8.2;
		//pi=2.12;
	
	}
	
	public void Area()
	{
		System.out.println(pi*radius*radius);
	}
	
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.setRadius(2.4);
		c.Area();
	}
	

}
