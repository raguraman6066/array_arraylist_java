
/*
 * array is a collection of similar type of elements.
 * fixed size..we cant resize once defined.
 * java pass by value..except arrays and object
*/
public class Demo {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;
        System.out.println("Hello, World!");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("--------");
        // enhanced for loop, forward only, read only
        for (int val : arr) {
            System.out.println(val);
        }

        int[] arr1 = arr;// both(arr/arr1) array pointing to same location
        arr1[3] = 100;
        System.out.println(arr[3]);

        System.out.println("-----");
        int i = 0;
        int j = 2;
        System.out.println(arr[i] + ", " + arr[j]);
        // swap(arr, arr[i], arr[j]);
        swap(arr, i, j);// array, fist index and second index
        System.out.println(arr[i] + ", " + arr[j]);
    }

    /*
     * private static void swap(int i, int j) {
     * int temp = i;
     * i = j;
     * j = temp;
     * }
     */

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
