package Day6Saturday;
//Nayan - Game
import java.util.HashSet;
import java.util.Iterator;

public class TestBeanHashSet2 {
public static void main(String[] args) {
	BeanHashSet2 b1 = new BeanHashSet2(" Tic Tac Toe", 100, 1);
	BeanHashSet2 b2 = new BeanHashSet2("Among us", 1, 10);
	BeanHashSet2 b3 = new BeanHashSet2("PUB G", 5, 13);
	BeanHashSet2 b4 = new BeanHashSet2("Pokemon Go", 20, 5);
			
			HashSet<BeanHashSet2> h1 = new HashSet <BeanHashSet2>();
	  
	h1.add(b1);
	h1.add(b2);
	h1.add(b3);
	h1.add(b4);
	
	
	System.out.println("\n ************ Iterator *************");
	
	Iterator<BeanHashSet2> itr1 = h1.iterator();
	while(itr1.hasNext())
	{
		BeanHashSet2 res = itr1.next();
		System.out.println(res);
	}
	
}
}
