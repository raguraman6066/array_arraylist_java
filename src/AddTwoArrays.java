import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] one = { 1, 2, 8 };
        int[] two = { 1, 2, 3 };
        System.out.println(sumOfTwoArrays(one, two));
    }

    private static ArrayList<Integer> sumOfTwoArrays(int[] one, int[] two) {
        ArrayList arrayList = new ArrayList<>();
        int carry = 0;
        int i = one.length - 1;
        int j = two.length - 1;
        int sum = 0;

        while (i >= 0 || j >= 0) {

            if (i >= 0) {
                sum += one[i];
            }
            if (j >= 0) {
                sum += two[j];
            }
            // total = 11

            sum = sum + carry;// last digit
            int rem = sum % 10;// front digits
            carry = sum / 10;

            arrayList.add(0, rem);
            i--;
            j--;
        }
        if (carry != 0) {
            arrayList.add(0, carry);

        }

        return arrayList;
    }
}
