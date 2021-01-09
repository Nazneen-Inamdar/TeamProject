package day4.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {
	/*
	* adding of values in arraylist using scanner and loops
	* run a for loop to add four cities in arraylist of string and then display all of them
	* names of cities should be received by user-input using Scanner
	*/
	
	public static void main(String[] args) {
		ArrayList<String> listOfCities = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=3; i++) {
		System.out.println("Enter a city Name:");
		String city = sc.nextLine();
		listOfCities.add(city);
		}
		System.out.println(listOfCities);
		}

}
