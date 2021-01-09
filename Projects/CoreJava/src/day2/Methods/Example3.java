package day2.Methods;

public class Example3 {
	public static int add(int x, int y) {
		int z = x+y;
		return z;
		}
		public static int subtract(int x, int y) {
		int z = x-y;
		return z;
		}
		public static void main(String[] args) {
		int res= add(8, 5);
		int res1 = subtract(5,6);
		System.out.println(res+" "+res1);
		}
		
}
