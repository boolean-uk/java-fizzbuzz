package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        int listLen = Math.abs((higher-lower)+1);
        String[] list = new String[listLen];

        for (int i = 0; i < listLen; i++) {
            int currNum = lower + i;

            if (currNum % 3 == 0 && currNum % 5 == 0) {
                list[i] = "Fizzbuzz";
            } else if (currNum % 5 == 0) {
                list[i] = "Buzz";
            } else if (currNum % 3 == 0) {
                list[i] = "Fizz";
            } else {
                list[i] = String.valueOf(currNum);
            }
        }

        return list;
    }
}
