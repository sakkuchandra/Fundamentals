import java.util.*;  
public class SynchronizedMap 
{  
    public static void main(String[] args) 
    {  
        Map<Integer, Integer> map = new HashMap<>();  
        map.put(1, 1001);  
        map.put(2, 1002);  
        map.put(3, 1003);  
        map.put(4, 1004);  
        map.put(5, 1005);  
        System.out.println("Map before Synchronized map: " + map);        
        Map<Integer, Integer> synmap = Collections.synchronizedMap(map);    
          map.remove(4, 1004);  
         System.out.println("Synchronized map after remove(4, 1004):" + synmap);  
         }  
}  