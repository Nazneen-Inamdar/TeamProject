package day5.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestBeanPerfume {
	public static void main(String[] args) {
		
		ArrayList <BeanPerfume> a1 = new ArrayList<BeanPerfume>();
		BeanPerfume b1 = new BeanPerfume("Flourish","Peter England",150.00,390);
		BeanPerfume b2 = new BeanPerfume("The Pride","Armaf",100.00,2000);
		BeanPerfume b3 = new BeanPerfume("Hero","Park Avenue",155.00,250);
		BeanPerfume b4 = new BeanPerfume("Paradise","Fogg",120.00,180);

		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		
		Iterator<BeanPerfume> itr1 = a1.iterator();
		while(itr1.hasNext())
		{
			BeanPerfume x = itr1.next();
			System.out.println(x);
		}
			
		
	}
	



  





}
