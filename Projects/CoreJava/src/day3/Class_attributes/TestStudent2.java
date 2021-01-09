package day3.Class_attributes;

import day3.Beans.Student;

public class TestStudent2 {
	public static void main(String[] args) {
		
		TestStudent2 ts1 = new TestStudent2();
		
		Student s1= new Student(1,"Nazneen","BE-Comp");// parameterized constructor called
		
		Student s2= new Student(2,"Arbaj","BE-Mech");
		
		Student s3= new Student(3,"Rozina","BE-Entc");
		
		Student s4= new Student(4,"Asif","BE-Mech");
		
		Student[] arrayStudent= {s1,s2,s3,s4}; // array of obj is created
		
		ts1.displayAllStudents(arrayStudent); /* method dispayAllStudents called
		by passing array of obj 
		Since the method is not static we had to create obj of the current class*/
		
	}
	
	public void displayAllStudents( Student arrayStudent[]) // Array of obj passed as parameter
	{
		for(Student st : arrayStudent)  
		{
		System.out.println(st);
		}
		
	}
}
