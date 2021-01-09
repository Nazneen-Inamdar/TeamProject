package day2.Methods;

public class Practice5 {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
		sum += i;
		System.out.println(sum);
		}
}
