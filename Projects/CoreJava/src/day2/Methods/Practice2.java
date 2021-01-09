
/*Write a program that prints the integers from 1 to 100.
But for multiples of 3 print "Fizz" instead of the
number, and for the multiples of 5 print "Buzz".
For numbers which are multiples of both 3 and 5
print "FizzBuzz".
For the rest, print the actual number*/

package day2.Methods;

public class Practice2 {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=100)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
		   else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			
			else{
				System.out.println(i);
			    }
			i++;
			
		}
		
	}


}
