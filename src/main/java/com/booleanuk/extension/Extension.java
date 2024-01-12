package com.booleanuk.extension;

import com.booleanuk.core.Exercise;

import java.util.ArrayList;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        Exercise exercise = new Exercise();
        int length = higher - lower + 1;
        String[] numbers = new String[length];
        for(int i = 0; i < length; i++) {
            numbers[i] = String.valueOf(lower + i);
        }
        exercise.fizzbuzz(numbers);

        return numbers;
    }
}
