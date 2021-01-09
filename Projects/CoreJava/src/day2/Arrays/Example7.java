package day2.Arrays;

//PRINTING ARRAY USING NESTED FOR LOOPS

public class Example7 {

	public static void main(String[] args) {
		int[][] myNumbers = {{40, 32, 55}, {23, 35, 61}};
		
		for(int i=0; i<myNumbers.length;i++) {
			
			int[] inner_array=myNumbers[i];
			
			for(int j=0;j<inner_array.length;j++)
			{
				System.out.print("\t"+inner_array[j]);
			}
			
		}
	}
}
