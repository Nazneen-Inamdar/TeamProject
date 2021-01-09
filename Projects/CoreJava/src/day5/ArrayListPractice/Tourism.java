package day5.ArrayListPractice;

import java.util.*;

public class Tourism {
	public static void main(String args[])
	{
		ArrayList <String> tourism =new ArrayList<String>();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the names of famous tourist spot of your city: \n");
		
		for(int i=0;i<5;i++)
		{
		String places =s1.nextLine();
		tourism.add(places);
		}
		
		for(String show:tourism)
		{
			System.out.println(show);
		}
		
	}

}
