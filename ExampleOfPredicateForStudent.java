import java.util.function.Predicate;

public class ExampleOfPredicateForStudent 
{
    public static void main(String[] args) 
    {
        // Adding data of Student
        Student11 studentOne =  new Student11(1, "MCA", "Ram");
        Student11 studentTwo =  new Student11(2, "MSC", "Sham");
        
        Predicate<Student11> predicate = (student11) -> (student11.getRollNo() == 2);
        System.out.println("Is student rollNo is 2 = "+predicate.test(studentOne));
        
        System.out.println("Is student rollNo is 2 = "+predicate.test(studentTwo));
    }

}