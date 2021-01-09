
/**
*
* Write a Java program to find sum of values of a given array.
*
*/



 package day2.Methods;

public class Practice3 {
	public static void main(String[] args) {
		int[] marks = {69, 85, 66, 80, 81 };
		int sum =0;
		for(int i:marks)
		{
			
			sum= sum+i;
			
		}
		System.out.println(sum);
		int avg= sum/marks.length;
		System.out.println(avg);
}
}