import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamGetListOfEmployees {
 
    public static void main(String[] args) 
    {
      //  List<Employee> employeesList=getListOfEmployees();
 
        // Write stream code here
    	StreamGetListOfEmployees e=new StreamGetListOfEmployees();
    	e.getListOfEmployees();
    }
 
    //public static List<Employee> getListOfEmployees() 
    public void getListOfEmployees()
    {
 
        List<Employee> listOfEmployees = new ArrayList<>();
 
        Employee e1 = new Employee("Mohan", 24,"abc","x1y1z1","texas","dallas","520007");
        Employee e2 = new Employee("John", 27,"def","x2y2z2","NewJersy","dallas","520007");
        Employee e3 = new Employee("Vaibhav", 32,"klm","x3y3z3","Mexico","dallas","520007");
        Employee e4 = new Employee("Amit", 22,"abc","x4y4z4","texas","dallas","520007");
 
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
 
//        return listOfEmployees;
        
        List<String> employeeNames = listOfEmployees.stream().map(e -> e.getCity()).filter(s -> s.equals("texas")).collect(Collectors.toList());
System.out.println(employeeNames);
    }
}