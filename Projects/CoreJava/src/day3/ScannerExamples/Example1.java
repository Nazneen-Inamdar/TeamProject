package day3.ScannerExamples;
import java.util.Scanner;

public class Example1 {
public static void main(String[] args) {
	
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name=s1.nextLine();
	System.out.println("Name: "+name);
	
	System.out.println("Enter your age: ");
	int age=s1.nextInt();
	System.out.println("Age: "+age);
	
	
}
}
