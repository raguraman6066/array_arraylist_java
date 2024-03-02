public class TwoDWave {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 7, 10 }, // a1[0]
                { 3, 4, 8, 11 }, // a1[1]
                { 5, 6, 9, 12 }// a1[2]
        };
        waveDisplay(arr);
        System.out.println(arr[0].length);// number of element in first index of row
    }

    private static void waveDisplay(int[][] arr) {
        for (int c = 0; c < arr[0].length; c++) {// 4
            if (c % 2 == 0) {
                // move down
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();

            } else {
                // move up
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();

            }
        }

    }
}
