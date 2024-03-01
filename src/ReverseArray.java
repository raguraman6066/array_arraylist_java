
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        display(arr);
        System.out.println("---");
        reverse(arr);

        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr) {
        int i = 0;// points first element of array
        int j = arr.length - 1;// points last element of array

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
