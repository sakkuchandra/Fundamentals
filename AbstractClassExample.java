//Abstract class is a class which is partially implemeted or partially defined 
//class.

abstract class Shape
 {
	 double dim1,dim2;
	 
	 public Shape(double d1,double d2)   //This is constructor
	 {
		 dim1=d1;
		 dim2=d2;
	 }
	 abstract public double Area();  //undefined Method
}
 
 public class AbstractClassExample extends Shape
 {
	
	 public AbstractClassExample(double d1,double d2)
	 {
		 //Shape(d1,d2);
		 super(d1,d2);
	 }
	 
	//super class method reimplemented in subclass is known as overriding
	 public double Area()  
	 {
		 return dim1*dim2;  //overriding
	 }
	 public static void main(String args[])
	 {
		 AbstractClassExample a=new AbstractClassExample(10.0,20.0);
		 System.out.println(a.Area());
	 }
 }