
public class MyOpreation 
{
	int a[]= {6,5,1,2,3,4,2};
	
	public void MyOperaton1()
	{
		int find=0;
		for(int i=0;i<a.length;i++)
		{
			   if(a[i]>a[i+1])
			   {
				   find=1;
			   }
			   else if(a[i]<a[i+1])
			   {
				   find=1;
			   }
			   else
			   {
				   //System.out.println(a[i]);
				   break;
			   }
		}
	
	}
	public static void main(String args[])
	{
		MyOpreation mo=new MyOpreation();
		mo.MyOperaton1();
		
	}

}
