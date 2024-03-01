import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        // two arrays ..matching elements we put in one array
        // take one item in first array..search in entire second array
        int[] one = { 10, 19, 20, 30, 40, 40, 40, 50 };
        int[] two = { 15, 16, 17, 20, 25, 30, 30, 40, 50 };
        int i = 0;
        int j = 0;
        // we can not predict output lenth of array..so we using arraylist
        // answer array -> arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                i++;
            } else if (one[i] > two[j]) {
                j++;
            } else {
                arrayList.add(one[i]);
                i++;
                j++;
            }
        }
        System.out.println(arrayList);
    }
}
