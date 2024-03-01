import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // add towards the end, can have multiple type of values, updates index
        // automatically
        arrayList.add("john");
        arrayList.add("Kimm");
        // arrayList.add(23);
        System.out.println(arrayList);
        System.out.println("-------");

        // access element
        String str = arrayList.get(0);
        System.out.println(str);

        // change element
        arrayList.set(0, "kenadi");
        System.out.println(arrayList);

        // add at specific index //remaining element move accordingly
        arrayList.add(0, "jorge");
        System.out.println(arrayList);

        // remove element
        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
