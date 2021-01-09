package day7.ExceptionHandling;
/*Finally Keyword- The finally statement lets you execute code, 
 after try...catch, regardless of the result:
*/
public class Example2 {

	public static void main(String[] args) {
		

	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[20]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	    finally {
	    System.out.println("This is finally block");
	    }
	}
}
