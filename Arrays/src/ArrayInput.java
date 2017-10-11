import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		
		// defining size beforehand is a good practice
		int SIZE = 10;
		int[] array = new int[SIZE];
		
		// declare scanner
		Scanner in = new Scanner(System.in);
		
		// take input
		for (int i = 0; i < SIZE; i++) {
			array[i] = in.nextInt();
		}
		
		// print
		for (int i = 0; i < SIZE; i++) {
			System.out.println(array[i]);
		}

		// close scanner
		in.close();
	}

}
