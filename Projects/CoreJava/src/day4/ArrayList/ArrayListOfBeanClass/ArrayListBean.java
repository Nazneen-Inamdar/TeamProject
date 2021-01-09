package day4.ArrayList.ArrayListOfBeanClass;
import java.util.ArrayList; 

import day3.Class_attributes.Employee; 
/*imported employee Bean class
 from different package called Class_attribute from day3*/

public class ArrayListBean {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Nazneen");
		Employee employee2 = new Employee(1002, "Arbaj");
		Employee employee3 = new Employee(1003, "Rozina");
		Employee employee4 = new Employee(1004, "Asif");
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		for(Employee employee:employeesList) {
		System.out.println(employee);
		}
		}
	}
	
	
