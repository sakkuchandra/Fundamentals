import java.util.function.Predicate;

public class ExampleOfPredicateWithoutLambda 
{
    public static void main(String arg[])
    {
        String stringOne = "Hello";
        Predicate<String> predicate = new Predicate<String>() {
            
            @Override
            public boolean test(String stringTwo) 
            {
                return stringOne.equals(stringTwo);
            }
        };
        
        System.out.println("It test the given string with predicate: ");
        System.out.println(predicate.test("Hi"));
        System.out.println(predicate.test("Hello"));
    }
    
}