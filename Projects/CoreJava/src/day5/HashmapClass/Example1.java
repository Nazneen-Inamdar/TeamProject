package day5.HashmapClass;

import java.util.HashMap;

public class Example1 {
	
	public static void main(String[] args) {
		HashMap<Integer , String > cities = new HashMap();
		cities.put(1,"Pune"); // adds key value pair to HashMap
		cities.put(2,"Mumbai");
		cities.put(3,"Nagpur");
		cities.put(4,"Sangli");
		cities.put(1,"Delhi"); // updates the value at key=1
		System.out.println(cities);
	}

		
}
