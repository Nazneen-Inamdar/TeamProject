package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerBO extends Player {
	
	
	
	public void displayAllPlayerDetails(Player[] playerList)
	{
		
		for(Player res:playerList)
		{
			System.out.println(res);
		}
	}
	
	void displaySpecificPlayerDetails(Player[] playerList, String countryName)
	{
		if(countryName.equalsIgnoreCase(getCountry()))
		{
		for(Player res : playerList)
		{
			System.out.println(res);
		}
		}
	}
}
