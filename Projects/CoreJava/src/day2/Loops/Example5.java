package day2.Loops;

public class Example5 {
public static void main(String[] args) {
	// BREAK STATEMENT
	for(int i=0;i<10;i++)
	{
		if(i==5)
		break;
		System.out.println(i);
	}
	
	System.out.println();
	
	// CONTINUE STATEMENT
	for(int i=0;i<10;i++)
	{
		if(i==5)
		continue;
		
		System.out.println(i);
	}
	


}
}
