package day4.ArrayList;

import java.util.*;


public class Example2 {
public static void main(String[] args) {
	ArrayList <String>a2 = new ArrayList<String>();
	a2.add("Nazneen");    // add method to add element in arrayList
	a2.add("Arbaj");
	a2.add("Rozina");
	a2.add("Asif");
	a2.add("Muzammil");
	
	System.out.println(a2.size());
	
	Iterator <String>it1 = a2.iterator();
	while(it1.hasNext()) {
		String x = it1.next();
		System.out.println(x);
		}
	
}
}
