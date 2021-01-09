package day7.ExceptionHandling;

public class Example1 {
	public static void main(String[ ] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[2]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	    
	    System.out.println("HI");
	  }


}
