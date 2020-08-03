package day37ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Rakhat");
        students.add("Eric");
        students.add("Amina");
        students.add("Belek");
       // verify that the names Eric and Amina are contained in students list
        boolean result = students.containsAll(Arrays.asList("Amina", "Eric") );
        System.out.println(result);


        // addAll()
        ArrayList<Integer> numbers = new ArrayList<>();
//        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100 } ;
//        numbers.addAll(Arrays.asList(nums)); //or you can do :
        numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));
        System.out.println(numbers);
    }
}
