
public class MinArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 1, 9 };
        minimum(arr);
    }

    public static void minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        // int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum value " + min);
    }
}
