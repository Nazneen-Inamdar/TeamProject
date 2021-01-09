package day3.Class_attributes;

public class TestConstructor {
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c.getEmployeeId());
		System.out.println(c.getEmployeeName());
		
		System.out.println("Updating values in employee object...");
		
		c.setEmployeeId(60001);
		c.setEmployeeName("John");
		System.out.println(c.getEmployeeId());
		System.out.println(c.getEmployeeName());
		
		System.out.println("Creating object with parameterized constructor...");
		
		Constructor c1 = new Constructor(5001, "David");
		System.out.println(c1.getEmployeeId());
		System.out.println(c1.getEmployeeName());

		 }
}
