public class Employee 
{
 
    private String name;
    private int age;
    private String address1,address2;
    private String state,city,zip;
    //private List<String> listOfCities;
 
    public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Employee(String name, int age,String address1,String address2,String city,String state,String zip) 
    {
        super();
        this.name = name;
        this.age = age;
        this.address1=address1;
        this.address2=address2;
        this.city=city;
        this.state=state;
        this.zip=zip;
      //  this.listOfCities=listOfCities;
    }
 
    public String getName() 
    {
        return name;
    }
 
    public void setName(String name) 
    {
        this.name = name;
    }
 
    public int getAge() 
    {
        return age;
    }
 
    public void setAge(int age)
    {
        this.age = age;
    }
 
    
    @Override
    public String toString() 
    {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
 
    
    
}

