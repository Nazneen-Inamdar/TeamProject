package day4.ArrayList;

import java.util.ArrayList;

public class Example1 {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList (); 
	
	/* ArrayList <String> a1 = new ArrayList<String>(); --> this is also correct,  we specify <String>
	 to give more clear idea to the reader that of what are we creating the array*/
	
	a1.add("Nazneen");    // add method to add element in arrayList
	a1.add("Arbaj");
	a1.add("Rozina");
	a1.add("Asif");
	a1.add("Muzammil");
	
	/*a1.add(20);  U can add different data type values in arraylist
	a1.add(20.89);*/
	
	System.out.println(a1);
	
	System.out.println(a1.get(0)); 
	//accessing specific element according to the given address
	
	System.out.println(a1.get(1));
	
	a1.set(3, "Shama"); // set method is used to update certain value in arrayList
	System.out.println("\n******* Updated ArrayList*******");
	System.out.println(a1);
	
	System.out.println("\n To remove element at index 3");
	a1.remove(3); // removes element at specific index
	System.out.println(a1);
	
	System.out.println("\nTo clear whole arrayList");
	a1.clear(); // clears whole arrayList
	System.out.println(a1);
}

}
