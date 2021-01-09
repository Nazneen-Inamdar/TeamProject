package Day6Saturday;

import java.util.ArrayList;

public class TestBeanArrayList2 {
public static void main(String[] args) {
		
		BeanArrayList2 b1 = new BeanArrayList2(101, "Audi", 250000);
		BeanArrayList2 b2 = new BeanArrayList2(102, "BMW", 330000);
		BeanArrayList2 b3 = new BeanArrayList2(103, "Duster", 140000);
		BeanArrayList2 b4 = new BeanArrayList2(104, "Swift", 80000);
		
		ArrayList<BeanArrayList2> a1= new ArrayList<BeanArrayList2>();
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		
		for(BeanArrayList2 show:a1)
		{
		 System.out.println(show);
		}
		
}
	}


