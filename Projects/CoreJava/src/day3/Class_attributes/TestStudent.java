package day3.Class_attributes;
import day3.Beans.Student;  // to use obj of class from different package we import the class

public class TestStudent {

	public static void main(String[] args) {
		Student s1= new Student(1,"Nazneen","BE-Comp");
		Student s2= new Student(2,"Arbaj","BE-Mech");
		Student s3= new Student(3,"Rozina","BE-Entc");
		Student s4= new Student(4,"Asif","BE-Mech");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
