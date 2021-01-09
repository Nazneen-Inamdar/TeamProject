package Day6Saturday;

import java.util.ArrayList;
import java.util.Iterator;

public class TestBeanArrayList3 {
public static void main(String[] args) {
		
		BeanArrayList3 b1 = new BeanArrayList3(101, "Dr.Varpe", 250);
		BeanArrayList3 b2 = new BeanArrayList3(102, "Dr.Mandora", 350);
		BeanArrayList3 b3 = new BeanArrayList3(103, "Dr.Mahabri", 400);
		BeanArrayList3 b4 = new BeanArrayList3(104, "Dr.Inamdar", 800);
		
		ArrayList<BeanArrayList3> a1= new ArrayList<BeanArrayList3>();
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		
		Iterator<BeanArrayList3> itr1 = a1.iterator();
		 while(itr1.hasNext())
		 {
			 BeanArrayList3 x = itr1.next();
			 System.out.println(x);
		 }
		


}
}
