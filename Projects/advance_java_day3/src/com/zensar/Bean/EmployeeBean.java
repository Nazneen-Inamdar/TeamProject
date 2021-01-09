package com.zensar.Bean;

public class EmployeeBean {

	private int emp_id;
	private String emp_name;
	private String designation;
	private int salary;
	private String gender;
	private String city;
	

	public EmployeeBean(int emp_id, String emp_name, String designation, int salary, String gender, String city) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.designation = designation;
		this.salary = salary;
		this.gender = gender;
		this.city=city;
	}

	@Override
	public String toString() {
		return "EmployeeBean [emp_id=" + emp_id + ", emp_name=" + emp_name + ", designation=" + designation
				+ ", salary=" + salary + ", gender=" + gender + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
