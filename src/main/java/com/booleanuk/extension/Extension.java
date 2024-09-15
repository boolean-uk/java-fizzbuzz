package com.booleanuk.extension;

import java.util.Arrays;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int[] holder = new int[higher - lower + 1];
        String[] textHOlder = new String[holder.length];


        int iCount = 0;

        for (int i = 1; i < holder.length + 1; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                textHOlder[iCount] = "Fizzbuzz";
                iCount++;
            } else if (i % 5 == 0) {
                textHOlder[iCount] = "Buzz";
                iCount++;
            } else if (i % 3 == 0) {
                textHOlder[iCount] = "Fizz";
                iCount++;
            } else {
                textHOlder[iCount] = String.valueOf(i);
                iCount++;
            }


        }
        System.out.println(Arrays.toString(textHOlder));

        return textHOlder;
    }
}
