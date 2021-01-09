package day3.Practice;

public class TestSmartCity {
	public static void main(String[] args) {
		SmartCity s1 = new SmartCity();
		Pune p1 = new Pune();
		Mumbai m1 = new Mumbai();
		
		s1.Transport();
		s1.Tourism();
		System.out.println("******************");
		
		p1.Transport();
		p1.Tourism();
		System.out.println("******************");
		
		m1.Transport();
		m1.Tourism();
		System.out.println("******************");
	}

}
