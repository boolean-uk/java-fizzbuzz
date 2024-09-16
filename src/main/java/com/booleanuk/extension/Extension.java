package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int difference = higher - lower + 1;
        String[] fizzedAndBuzzed = new String[difference];
        for(int i = 0; i < difference; i++) {
            int value = i + lower;
            if (value % 3 == 0 && value % 5 == 0) {
                fizzedAndBuzzed[i] = "Fizzbuzz";
            } else if (value % 3 == 0) {
                fizzedAndBuzzed[i] = "Fizz";
            } else if (value % 5 == 0) {
                fizzedAndBuzzed[i] = "Buzz";
            } else {
                fizzedAndBuzzed[i] = String.valueOf(value);
            }
        }


        return fizzedAndBuzzed;
    }
}
