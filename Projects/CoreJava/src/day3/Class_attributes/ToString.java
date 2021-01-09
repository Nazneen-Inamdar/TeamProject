package day3.Class_attributes;

public class ToString {
	private int employeeId;
	private String employeeName;
	public ToString() {
	}
	public ToString(int employeeId, String employeeName) {
	super();  // for now there is no use of super so it can be removed
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	}
	public int getEmployeeId() {
	return employeeId;
	}
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;	
	}
		
	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "ToString [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}
