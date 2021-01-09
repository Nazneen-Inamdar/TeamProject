package day2.Methods;

public class TestPractice {
	
		public static void main(String args[])
		{
			Practice p1 = new Practice();
			String[] names = p1.getArrayOfNames();
			System.out.println("Names of the patients: ");
			p1.Details(names);
			System.out.println();
			System.out.println("Ids of the patients: ");
			
			for(int i=0;i<5;i++)
			{
				int ids=p1.Details(i);
				System.out.println(ids);
			}
			
			System.out.println();
			
			System.out.println("Details of the patients: ");
			p1.Details(names,5);
			
		}

}
