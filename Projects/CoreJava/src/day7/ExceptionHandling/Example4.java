package day7.ExceptionHandling;
/* Whenever u add "THROWS" declaration to a method, 
 * u are actually deferring the responsibility of
 * handling the exception to the caller of that
 * method*/


public class Example4 {
	static void Exception(int age) throws java.lang.Exception
	{
		if(age<18)
		{
			throw new Exception("Access Denied, You must be atleast 18 years old");
		}
		else {
			System.out.println("Access granted, You are old enough");
		}
	}
	
	public static void main(String[] args) {
		try {
			Exception(11);
		} 
		
		catch (Exception e) {
			
        System.out.println("Something went wrong. \n "+e);		}
	}

}
