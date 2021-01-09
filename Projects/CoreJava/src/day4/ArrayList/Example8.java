package day4.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {
	public static void main(String[] args) {
		ArrayList <String>a2 = new ArrayList<String>();
		a2.add("Nazneen");    // add method to add element in arrayList
		a2.add("Arbaj");
		a2.add("Rozina");
		a2.add("Asif");
		a2.add("Muzammil");
		//Collections.sort(a2);
		
		Collections.sort(a2,Collections.reverseOrder());
		Collections.reverse(a2);
		System.out.println("Size of ArrayList is : "+a2.size());
		
		
		for(String x : a2)
		{
			
			System.out.println(x);
		}
		
		
		
		
		
	}

}
