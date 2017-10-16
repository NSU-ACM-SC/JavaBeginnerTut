public class ArrayInsideArray {
    public static void main(String[] args) {
        int[][] arrayHolder = new int[2][];

        int[] ar1 = {1, 2, 3};
        int[] ar2 = {4, 7, 9, 11, 15};

        arrayHolder[0] = ar1;
        arrayHolder[1] = ar2;

        // you can use a loop and print to verify!
    }
}
