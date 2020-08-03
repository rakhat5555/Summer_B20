package day37ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            boolean r1 =  list.contains(1); // true

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);
        boolean r2 = list.containsAll(elements);

        System.out.println(r2);
        System.out.println("==========================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


       boolean r3 =  list2.containsAll(Arrays.asList(1,2,4));
    }
}
