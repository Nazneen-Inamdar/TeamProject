package Day6Saturday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestBeanHashMap1 {
	public static void main(String[] args) {
		BeanHashMap1 b1 = new BeanHashMap1(1001, " Jet Airways", "12:30am");
		BeanHashMap1 b2 = new BeanHashMap1(1002, " Indian Airways", "3:15am");
		BeanHashMap1 b3 = new BeanHashMap1(1001, " American Airlines", "2:55pm");
		BeanHashMap1 b4 = new BeanHashMap1(1001, " Dubai Airways", "17:45pm");
				
				Map<Integer, BeanHashMap1> h1 = new HashMap <Integer,BeanHashMap1>();
		  
		h1.put(b1.getNum(), b1);
		h1.put(b2.getNum(), b2);
		h1.put(b3.getNum(), b3);
		h1.put(b4.getNum(), b4);
		
		Set<Integer> numSet = h1.keySet();
		
		
		System.out.println("\n ************ Iterator *************");
		
		Iterator<Integer> itr1 = numSet.iterator();
		while(itr1.hasNext())
		{
			Integer res = itr1.next();
			//BeanHashMap1 time = ((BeanHashMap1) h1).getTime();
			System.out.println(res);
		}
		
	}

}
