
/**
	*
	* Write a Java program to check if a given element exists in the array or not,
	* int[] salaries = {20000, 25000, 55000, 47000, 38000};
	* int salaryToFind = 55000;
	*
	*/
package day2.Methods;

public class Practice4 {
	
	

	 public static void main(String[] args) {
	int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
	int salaryToFind = 55000;
	
	for(int i=0;i<salaries.length;i++)
	{
		if(salaries[i]==salaryToFind)
		{
			System.out.println("found "+ "at location : "+i);
		}
		else {
			System.out.println("not found");
		}
	}

	 }
	}

