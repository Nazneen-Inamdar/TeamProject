package day5.LinkedList;
import java.util.*;
import java.util.Collections;
public class Example1 {


	public static void main(String[] args) {
		LinkedList <String>a2 = new LinkedList<String>();
		a2.add("Nazneen");    // add method to add element in arrayList
		a2.add("Arbaj");
		a2.add("Rozina");
		a2.add("Asif");
		a2.add("Muzammil");
		//Collections.sort(a2);
		
		Collections.sort(a2,Collections.reverseOrder());
		Collections.reverse(a2);
		System.out.println("Size of LinkedList is : "+a2.size());
		
		
		for(String x : a2)
		{
			
			System.out.println(x);
		}
		
		
		
		
		
	}

}
