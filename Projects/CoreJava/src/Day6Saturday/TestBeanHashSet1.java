package Day6Saturday;

import java.util.HashSet;
import java.util.Iterator;

public class TestBeanHashSet1 {
public static void main(String[] args) {
	BeanHashSet1 b1 = new BeanHashSet1("Machine Learning");
	BeanHashSet1 b2 = new BeanHashSet1("Artificial Intelligence");
	BeanHashSet1 b3 = new BeanHashSet1("Block Chain");
	BeanHashSet1 b4 = new BeanHashSet1("Java");
			
			HashSet<BeanHashSet1> h1 = new HashSet <BeanHashSet1>();
	  
	h1.add(b1);
	h1.add(b2);
	h1.add(b3);
	h1.add(b4);
	
	System.out.println("\n ************ For Each Loop *************");
	
	for(BeanHashSet1 show: h1)
	{
		System.out.println(show);
	}
	
	System.out.println("\n ************ Iterator *************");
	
	Iterator<BeanHashSet1> itr1 = h1.iterator();
	while(itr1.hasNext())
	{
		BeanHashSet1 res = itr1.next();
		System.out.println(res);
	}
	
}
}
