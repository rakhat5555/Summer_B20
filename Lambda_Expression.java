package day37ArrayListPractice;

import java.beans.PropertyEditorManager;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,2,5,6,7,8,9) );
        //Predicate<Integer> lessThan5 = p -> p < 5 ;
        // list.removeIf(lessThan5); or

        list.removeIf(p -> p < 5);

        System.out.println(list);
        System.out.println("===========================");

        Predicate<Integer> oddNumbers = p  -> p % 2 != 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

//        numbers.removeIf(oddNumbers);

        numbers.removeIf(p -> p % 2 == 0);

        System.out.println(numbers);

        System.out.println("===============================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Musti", "Rakhat", "Hasan", "Belek" ) );
        names.removeIf(each -> each.startsWith("M") && each.endsWith("y"));
        System.out.println(names);
        ArrayList<Integer>  number = new ArrayList<>();
        number.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));
        number.removeIf(p -> Collections.frequency(number, p) != 1 );
                            // for the elements that are not unique
        System.out.println(number);

        System.out.println("+==============================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'b', 'c', '3','4','5','6','$', '%', '*' ) );
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);
        System.out.println("+===================================================");

        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('a', 'b', 'c', '3','4','5','6','$', '%', '*' ) );

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list1);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits + "  digit");

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list1);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters + "  letters");

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list1);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println(specialChar + " special character");


    }
}
