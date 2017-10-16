import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        int[][][] ar3D = new int[2][3][5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    ar3D[i][j][k] = in.nextInt();
                }
            }
        }

        in.close();
    }
}
