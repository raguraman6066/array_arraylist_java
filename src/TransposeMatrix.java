public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 7 }, // a1[0]
                { 3, 4, 8 }, // a1[1]
                { 5, 6, 9 }// a1[2]
        };

        int row = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[cols][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }

        System.out.println(result[0][2]);

    }
}
