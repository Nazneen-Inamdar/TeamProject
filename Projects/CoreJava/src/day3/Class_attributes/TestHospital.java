package day3.Class_attributes;

import day3.Beans.Hospital;
import day3.Beans.Student;

public class TestHospital {
	
	public static void main(String[] args) {
		
		TestHospital obj = new TestHospital();
		
		Hospital h1= new Hospital(101,"John",'P',20000.98,"Jaundice",35);
		Hospital h2= new Hospital(102,"Ashwini",'N',4567.50,"No disease",22);
		Hospital h3= new Hospital(103,"Raaj",'P',120000.00,"Heart Blockage",65);
		Hospital h4= new Hospital(104,"Sachin",'P',15000.18,"Typhoid",43);
		
		Hospital[] PatientDetails= {h1,h2,h3,h4};
		
		obj.displayAllPatients(PatientDetails);
		
	}
	public void displayAllPatients( Hospital arrayOfPatient[]) // Array of obj passed as parameter
	{
		for(Hospital display : arrayOfPatient)  
		{
		System.out.println(display);
		}
		
	}

}
