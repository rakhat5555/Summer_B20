package day37ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000) );
        Integer maxNumber = Collections.max(list);
        System.out.println(maxNumber);
        Integer minNumber = Collections.min(list);
        System.out.println(minNumber + " is min number from the list");

        System.out.println("========================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Rakhat", "Belek", "Eric", "Amina", "Family", "Amina") );
        // replace all method
        Collections.replaceAll(names, "Amina", "Princess");
        System.out.println(names);
    }
}
