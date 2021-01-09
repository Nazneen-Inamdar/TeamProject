package day3.Inheritance;
/*An object of a child class can be stored 
 * in a reference of a parent class but not vice-versa.*/
public class Test2 {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();
	}

}
