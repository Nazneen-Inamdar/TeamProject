package day3.Class_attributes;

public class TestToString {
	public static void main(String[] args) {
		ToString c = new ToString();
		System.out.println(c.getEmployeeId());
		System.out.println(c.getEmployeeName());
		
		System.out.println("Updating values in employee object...");
		
		c.setEmployeeId(60001);
		c.setEmployeeName("John");
		System.out.println(c.getEmployeeId());
		System.out.println(c.getEmployeeName());
		
		System.out.println("Creating object with parameterized ToString...");
		
		ToString c1 = new ToString(5001, "David");
		System.out.println(c1.getEmployeeId());
		System.out.println(c1.getEmployeeName());
		/* We have used ToString method so we are able to print the employee details 
		 directly through object c1 without using getter and setter method  if ToString 
		 method was not used then printing c1 would just print the address of obj c1*/
		System.out.println(c1); 
		

		 }
}
