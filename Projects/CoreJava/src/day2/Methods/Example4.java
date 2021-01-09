package day2.Methods;

public class Example4 {
	public int add(int x, int y) {
		int z = x+y;
		return z;
		}
		public int subtract(int x, int y) {
		int z = x-y;
		return z;
		}
		public static void main(String[] args) {
			Example4 e1 = new Example4();
		int res= e1.add(8, 5);
		int res1 = e1.subtract(5,6);
		System.out.println(res+" "+res1);
		}
}
