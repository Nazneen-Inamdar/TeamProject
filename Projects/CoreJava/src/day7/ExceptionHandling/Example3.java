package day7.ExceptionHandling;

/* Throw keyword - The throw statement allows you to create a custom error.
The throw statement is used together with an exception type.
There are many exception types available in Java: 
ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException,
 SecurityException, etc*/

public class Example3 {
	static void Exception(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access Denied, You must be atleast 18 years old");
		}
		else {
			System.out.println("Access granted, You are old enough");
		}
	}
	
	public static void main(String[] args) {
		Exception(11);
	}

}
