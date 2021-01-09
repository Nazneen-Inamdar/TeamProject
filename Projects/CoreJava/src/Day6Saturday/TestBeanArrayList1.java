package Day6Saturday;

import java.util.ArrayList;

public class TestBeanArrayList1 {
	public static void main(String[] args) {
		
		BeanArrayList1 b1 = new BeanArrayList1("Iphone8", 50000);
		BeanArrayList1 b2 = new BeanArrayList1("Lenevo", 13000);
		BeanArrayList1 b3 = new BeanArrayList1("Mi-Xiomi-Note9Pro", 20000);
		BeanArrayList1 b4 = new BeanArrayList1("RealMe", 18000);
		
		ArrayList<BeanArrayList1> a1= new ArrayList<BeanArrayList1>();
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
	}

}
