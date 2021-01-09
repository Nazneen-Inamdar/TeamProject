package day2.Methods;

public class Practice {

	public static void Details(String name[])
	{
		for(String a:name)
		{
			System.out.println("Name: "+  a);
		}
	}
	
	public int Details(int id)
	{
	   int i=id;
	
		return i;
	}
	
	public static void Details(String arr[], int ids)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Name: "+ arr[i]+"  has id  "+ i);
		}
	}
	
	public String[] getArrayOfNames() {
		String[] names = {"Nazneen", "Arbaj", "Rozina", "Asif","Muzammil"};
		return names;
		}
	
	
	
}
