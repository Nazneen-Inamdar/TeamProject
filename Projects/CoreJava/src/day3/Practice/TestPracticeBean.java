package day3.Practice;

public class TestPracticeBean {

	public static void main(String[] args) {
		
		TestPracticeBean test1 = new TestPracticeBean();
		PracticeBean obj1 = new PracticeBean("Nazneen",21012,450.57);
		PracticeBean obj2 = new PracticeBean("Arbaj",42024,560.84);
		PracticeBean obj3 = new PracticeBean("Rozina",64046,897.63);
		PracticeBean obj4 = new PracticeBean("Asif",88088,249.94);
		
		PracticeBean [] arrayOfObj= {obj1,obj2,obj3,obj4};
		
		test1.displayCustomers(arrayOfObj);
		
	}
	
	private void displayCustomers(PracticeBean [] array)
	{
		for(PracticeBean b1 : array)
		{
			System.out.println(b1);
		}
	}
	
}
