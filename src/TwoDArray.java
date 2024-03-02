public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] arr = {
                { 1, 2, 7 }, // a1[0]
                { 3, 4, 8 }, // a1[1]
                { 5, 6, 9 }// a1[2]
        };

        // System.out.println(arr.length);
        // System.out.println(a1[2].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] val : arr) {
            for (int temp : val) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        // jagged array - unequal number of columns

        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        System.out.println(arr2[1].length);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
