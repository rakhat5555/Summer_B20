package day37ArrayListPractice;

import day35ArrayList.CombineArrays_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
       String s = "aa2aaa3";
       String result = "";
       for (char each : s.toCharArray())
       if(Character.isDigit(each) ) {
           result += each;
       }



    }
}