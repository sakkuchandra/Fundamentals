class Student12 
{
    private int rollNo;   //class scope variables
    private String name;
    private static final String college = "ABC"; // static variable
    
    public Student12(int rollNo, String name) //parameterized constructor
    {
        //super();
        this.rollNo = rollNo;
        this.name = name;
    	
    }
    
    public void DisplayStudent()
    {
    	System.out.println("Name is :"+name);
    	System.out.println("RollNumber is:"+rollNo);
    	System.out.println("College is:"+Student12.college);
    }
    
    /*
    @Override
    public String toString() //predefined method
    {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", college=" + college + "]";
    }
    */
}

public class StaticVariableExample 
{
	
		public static void main(String[] args) 
		{
	        Student12 student1 = new Student12(100, "srinivas");
	        Student12 student2 = new Student12(101, "siva");
	        Student12 student3 = new Student12(102, "prasad");
	        Student12 student4 = new Student12(103, "srikanth");
	        
	        student1.DisplayStudent();
	        student2.DisplayStudent();
	        student3.DisplayStudent();
	        student4.DisplayStudent();
	        
	}

}
