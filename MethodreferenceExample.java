@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class MethodreferenceExample
{  
    public void myMethod()
    {  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) 
    {  
    	MethodreferenceExample obj = new MethodreferenceExample();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}