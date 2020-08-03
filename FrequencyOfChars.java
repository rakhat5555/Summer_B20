package day37ArrayListPractice;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AABBC";
        //Do not use a nested loop
        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("") ) {
            list.add(each);
        }
        String nonDup = Util.removeDup(str);
        for( String each : nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }

    }
}
