import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapExample 
{
	
	Hashtable table;
	
	
	public void CreateHashtable()
	{
		table=new Hashtable();
		table.put("10", "Rama");
		table.put("20", "Vamsi");
		table.put("30", "mahesh");
		table.put("10", "Rishi");
		table.put("40", "Vamsi");
		//table.put(null, null);
		
		
		System.out.println("Displaying values without keys");
		Collection c=table.values();
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("Displaying values with keys");
		Set s=table.keySet();
		i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(table.get(i.next()));
		}
		
	}
	
	public void CreateTreeMap()
	{
		TreeMap map=new TreeMap();
		map.put("20", "Harish");
		map.put("10", "Kishore");
		map.put("40", "Mohan");
		map.put("20", "Ramesh");
		map.put("30", "Vijay");
		
		
		System.out.println("Displaying Values without keys");
		
		Collection c=map.values();
		
		Iterator i=c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Displaying Values with Keys");
		
		Set s=map.keySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(map.get(i.next()));
		}
		
	}
	
	public void CreateHashMap()
	{
		HashMap map=new HashMap();
		map.put("10", "Rama");
		map.put("20", "Vamsi");
		map.put("30", "mahesh");
		map.put("10", "Rishi");
		map.put("40", "Vamsi");
		//table.put(null, null);
		
		
		System.out.println("Displaying values without keys");
		Collection c=map.values();
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("Displaying values with keys");
		Set s=map.keySet();
		i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(map.get(i.next()));
		}
		
	}
	
	public static void main(String args[])
	{
		MapExample ma=new MapExample();
		//ma.CreateHashtable();
		//ma.CreateTreeMap();
		ma.CreateHashMap();
	}

}

