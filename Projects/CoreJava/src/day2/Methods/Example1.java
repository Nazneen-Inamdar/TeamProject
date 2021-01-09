package day2.Methods;

public class Example1 {
	
	public void add()      // non-static method --> called using Class obj
	{
		int x=5;
		int y=10;
		int z=x+y;
		System.out.println(z);
	}
	
	public static void sub()       // static method --> Can be called directly
	{
		int x=25;
		int y=10;
		int z=x-y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.add();
		
		sub();
	}

}
