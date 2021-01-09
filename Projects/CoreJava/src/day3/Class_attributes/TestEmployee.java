package day3.Class_attributes;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee();
	System.out.println(e1.getEmployeeId());
	System.out.println(e1.getEmployeeName());
	
	System.out.println("\n *****Updating the employee details*****");
	
	e1.setEmployeeId(93091);
	e1.setEmployeeName("Nazneen");
	
	System.out.println("\t"+e1.getEmployeeId());
	System.out.println("\t"+e1.getEmployeeName());
}
}
