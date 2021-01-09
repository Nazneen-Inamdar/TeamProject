package day3.Practice;
/* Quiz System*/
import java.util.Scanner;

public class PracticeScanner {
	static Scanner s1 = new Scanner(System.in);
public static void main(String[] args) {
	
	int ans;
	System.out.println("****Welcome To Nazland****");
	
	
	do {
		System.out.println("\n1. Guess the Movie Quiz"+ "\n2. Computer ki duniya Quiz");
		System.out.println("\n Enter your choice : ");
		int ch=s1.nextInt();
	switch(ch)
	{
	case 1: 
		System.out.println(" ******Guess the Movie******");
		Movie();
		break;
		
	case 2: 
		System.out.println(" ******Computer ki Duniyaa******");
		Java();
		break;
		
		default:
			System.out.println("Please enter valid choice");
			break;
	}
	System.out.println("Do you want to continue 1/0 ?");
	ans=s1.nextInt();
	
	
	}while(ans==1);
	
	System.out.println("Hope you Enjoyed, Do visit again !!");
		
}

public static void Movie()
{
	System.out.println("\n Lead actor: Shahrukh Khan "+
			"\n Lead actoress: Deepika Padukon "+
			"\n Hint: Rebirth ");
	String res="Om Shanti Om";
	
	System.out.println("Enter your guess : ");
	s1.nextLine();
	String movie= s1.nextLine();
	
	
	if(movie.equalsIgnoreCase("Om Shanti Om"))
	{
		System.out.println("Congo Right Ans !!!");
	}
	else
	{
		System.out.println("Better luck next time");
	}
}
public static void Java()
{
	System.out.println("What is the process of defining more than one method in a class differentiated by method signature?\r\n" + 
			"a) Function overriding\n" + 
			"b) Function overloading\n" + 
			"c) Function doubling\n" + 
			"d) None of the mentioned ");
	
	System.out.println("Enter your ans a/b/c/d: ");

	String ans= s1.nextLine();
	//s1.nextLine();
	
	String res="b";
	
	if(ans.equalsIgnoreCase(res))
	{
		System.out.println("Congo Right Ans !!!");
	}
	else
	{
		System.out.println("Better luck next time");
	}
}
}
