package day7.ExceptionHandling.Userdefined_Exceptions;

public class AgeNotValidException extends Exception {
	
	public AgeNotValidException()
	{
		System.out.println("Age must be more than 18");
	}
	
	public AgeNotValidException(String msg) {
		System.out.println(msg );
	}

}
