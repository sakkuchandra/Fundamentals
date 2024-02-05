import java.util.Arrays;
import java.util.*;


public class SplitIteratorExample 
{
	 public static void main(String[] args) 
	 {
		    List<Integer> input = Arrays.asList(5, 3, 21, 15, 9, 2, 12, 11);
		    
		    Spliterator<Integer> sitr1 = input.spliterator();
		    Spliterator<Integer> sitr2 = sitr1.trySplit();
		    
		    System.out.println("SplitIterator 1:");
		    sitr1.forEachRemaining(num -> System.out.println(num));
		    
		    System.out.println("SplitIterator 2:");
		    sitr2.forEachRemaining(num -> System.out.println(num));
		  }

	

}
