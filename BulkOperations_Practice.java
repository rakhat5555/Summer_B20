package day37ArrayListPractice;

import java.lang.reflect.Array;
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

        System.out.println("===============================");
        ArrayList<String> group1 = new ArrayList<>();
        group1.addAll(Arrays.asList("Belek", "Muhtar", "Eric", "Amina", "Roman") ) ;
        boolean result1 =  group1.containsAll(Arrays.asList("Murodil", "Kuzzat") );
        System.out.println(result1);

        System.out.println("=======================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,2,1,3,4,5,5,6,1, 7,8,9,10,11,12,13));
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1,2,5,10,11) );
        System.out.println(nums);
        System.out.println("============================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,2,2,1,3,4,5,5,6,1, 7,8,9,10,11,12,13));
        num1.retainAll(Arrays.asList(1,2,3,9) );
        System.out.println(num1);

        System.out.println("==============================");
        // remove all names which matches "Eric" from the list
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Eric", "Mama", "Belek", "Eric", "Amina", "Princess"));
        names.removeAll(Arrays.asList("Eric")); // if you have to keep it use retainALl()
        System.out.println(names);
    }
}
