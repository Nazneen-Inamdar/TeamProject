package day2.Arrays;

//Updating existing values of array

public class Example4 {
	public static void main(String[] args) {
		String cars[]= {"Duster","Zen","Jeep","Mobilio","Indica"};
		cars[1]="Audi";
		cars[2]="Mahindra Thar";
		cars[4]="Beetle";
		for(String car: cars)
		{
			System.out.println(car);
		}
	}

}
