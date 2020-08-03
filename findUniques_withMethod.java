package day37ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class findUniques_withMethod {
    public static void main(String[] args) {
        String str = "AABBCDDEERHT";  //C, Find a unique character
        String unique = "";
        ArrayList<String> list =new ArrayList<>();
        for(String each : str.split("") ) {
            list.add(each);
        }
        for( String each : list) {
            int count = Collections.frequency(list, each);

            if(count == 1) {
                unique += each;
            }
        }
        System.out.println(unique);

    }
}
