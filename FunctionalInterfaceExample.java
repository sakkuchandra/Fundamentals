@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}
public class FunctionalInterfaceExample 
{
	 public static void main(String args[]) {
	        // lambda expression
	    	MyFunctionalInterface sum = (a, b) -> a + b;
	        System.out.println("Result: "+sum.addMethod(12, 100));
	    }

}
