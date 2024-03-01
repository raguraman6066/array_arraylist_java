public class RunningSumArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        /*
         * int[] result = new int[4];
         * for (int i = 0; i < arr.length; i++) {
         * 
         * int sum = 0;
         * for (int j = 0; j <= i; j++) {
         * 
         * sum = sum + arr[j];
         * }
         * result[i] = sum;
         * 
         * }
         * System.out.println(result[0]);
         * System.out.println(result[1]);
         * System.out.println(result[2]);
         * System.out.println(result[3]);
         */
        System.out.println(runningSumArray(arr)[3]);

    }
    // add the first index value to second index value, then
    // add second index result to third index value..

    public static int[] runningSumArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;

    }
}
