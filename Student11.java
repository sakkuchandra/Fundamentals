public class Student11 
{
	int rollNo;
    String className;
    String name;
    
    public Student11(int rollNo, String className, String name) 
    {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }
    public int getRollNo() 
    {
        return rollNo;
    }
    public void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }
    public String getClassName() 
    {
        return className;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String args[])
    {
    	Student11 s=new Student11(10,"MS","abc");
    	System.out.println(s.getName());
    	System.out.println(s.getRollNo());
    	System.out.println(s.getClassName());
    }

}
