package day5.ArrayListPractice;

import java.util.ArrayList;

public class Train {
	
	public static void main(String[] args) {
		
		ArrayList <Double> train_timings = new ArrayList<Double>();
		
		train_timings.add(12.30);
		train_timings.add(1.55);
		train_timings.add(3.20);
		train_timings.add(4.22);
		train_timings.add(6.30);
		train_timings.add(7.45);
		train_timings.add(8.35);
	System.out.println("The train timings are : \n");	
	for(int i=0;i<train_timings.size();i++)
	{
		System.out.println(" Depature at : " + train_timings.get(i)+"pm");	
	}
		
		
		
	}

}
