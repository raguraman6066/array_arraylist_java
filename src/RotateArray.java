
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotateArray(arr, k);
    }

    private static void rotateArray(int[] arr, int k) {
        int lengthArray = arr.length;
        k = k % lengthArray;
        if (k < 0) {// if negative
            k = k + lengthArray;// we get positive
        }

        // number of rotation
        for (int i = 1; i <= k; i++) {
            int temp = arr[lengthArray - 1];// get last element
            for (int j = lengthArray - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        for (int ar : arr) {
            System.out.println(ar);
        }
    }
}
