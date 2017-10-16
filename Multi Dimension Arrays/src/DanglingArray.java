import java.util.Scanner;

public class DanglingArray {
    public static void main(String[] args) {
        int[][] danglingArray = new int[3][];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int size = 5; // ধরেনিলামসাইজ৫
            danglingArray[i] = new int[size];

            // you can also randomize size by taking input

            // take input
            for (int j = 0; j < size; j++) {
                // use scanner
            }
        }

        in.close();
    }
}
