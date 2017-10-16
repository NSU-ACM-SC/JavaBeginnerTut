import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] ar2D = new int[2][3];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ar2D[i][j] = in.nextInt();
            }
        }

        in.close();
    }
}
