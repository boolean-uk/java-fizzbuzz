package com.booleanuk.extension;

import java.util.ArrayList;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        String[] result = new String[higher - lower + 1];

        for (int i = lower, index = 0; i <= higher; i++, index++) {
            boolean isMultipleOfThree = i % 3 == 0;
            boolean isMultipleOfFive = i % 5 == 0;

            if (isMultipleOfThree && isMultipleOfFive) {
                result[index] = "Fizzbuzz";
            } else if (isMultipleOfThree) {
                result[index] = "Fizz";
            } else if (isMultipleOfFive) {
                result[index] = "Buzz";
            } else {
                result[index] = String.valueOf(i);
            }
        }

        return result;
    }
}
