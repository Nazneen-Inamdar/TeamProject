package day5.LinkedList;
import java.util.LinkedList;

import day3.Class_attributes.Employee; 
public class BeanLinkedList {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Nazneen");
		Employee employee2 = new Employee(1002, "Arbaj");
		Employee employee3 = new Employee(1003, "Rozina");
		Employee employee4 = new Employee(1004, "Asif");
		LinkedList<Employee> employeesList = new LinkedList<Employee>();
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		for(Employee employee:employeesList) {
		System.out.println(employee);
		}
		}

}
