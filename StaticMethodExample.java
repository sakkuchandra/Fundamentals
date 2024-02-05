public class StaticMethodExample 
{

    private static int a = 20;   //static variables
    private static int b = 10;

    public static void main(String[] args) 
    {
        // static main() method calls static add() method
        System.out.println(add());
        System.out.println(substract());
    }

    private static int add()    //static method
    {
        return (a + b);
    }

    private static int substract()    //static method
    {
        return (a - b);
    }
}
