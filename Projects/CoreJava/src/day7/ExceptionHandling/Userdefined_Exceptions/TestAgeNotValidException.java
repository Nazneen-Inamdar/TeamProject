package day7.ExceptionHandling.Userdefined_Exceptions;

public class TestAgeNotValidException {

		static void Exception(int age) throws AgeNotValidException
		{
			if(age<18)
			{
				throw new AgeNotValidException("Access Denied, You must be atleast 18 years old");
			}
			else {
				System.out.println("Access granted, You are old enough");
			}
		}
		
		public static void main(String[] args) {
			try {
				Exception(11);
			} catch (AgeNotValidException e) {
						System.out.println(e);
			}
		}

	}



