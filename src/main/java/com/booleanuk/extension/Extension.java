package com.booleanuk.extension;

import java.util.Arrays;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

       String[] array = new String[higher - lower];

        for (int i = 0; i < array.length; i++) {
            int number = i + lower;

            if (number % 3 == 0 && number % 5 == 0) {
                array[i] = "Fizzbuzz";
            } else if (number % 3 == 0) {
                array[i] = "Fizz";
            } else if (number % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = Integer.toString(number);
            }
        }

        System.out.println(Arrays.toString(array));

        return array;
    }
}
