import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListExample 
{
    
    public static void main(String[] args) 
    { 
    	ArrayList<String> al = new ArrayList<String>();
        al.add("AA");
        al.add("BB");
        al.add("CC");
        al.add("DD");
        al.add("EE");
        al.add("FF");
        System.out.println("ArrayList before remove:");
        for(String var: al)
        {
            System.out.println(var);
        }
        //Removing element AA from the arraylist
        al.remove("AA");
        //Removing element FF from the arraylist
        al.remove("FF");
        //Removing element CC from the arraylist
        al.remove("CC");
        /*This element is not present in the list so
         * it should return false
         */
        boolean bool=al.remove("GG");
        System.out.println("Element GG removed: "+bool);
        System.out.println("ArrayList After remove:");
        for(String var: al)
        {
            System.out.println(var);
        }
        
        
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("AA");
        ll.add("BB");
        ll.add("CC");
        ll.add("DD");
        ll.add("EE");
        ll.add("FF");
        System.out.println("LinkedList before remove:");
        for(String var: ll)
        {
            System.out.println(var);
        }
        //Removing element AA from the Linkedlist
        ll.remove("AA");
        //Removing element FF from the Linkedlist
        ll.remove("FF");
        //Removing element CC from the Linkedlist
        ll.remove("CC");
        /*This element is not present in the list so
         * it should return false
         */
        boolean bool1=ll.remove("GG");
        System.out.println("Element GG removed: "+bool1);
        System.out.println("ArrayList After remove:");
        for(String var: ll)
        {
            System.out.println(var);
        }   
 
 }
}
