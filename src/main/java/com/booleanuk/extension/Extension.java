package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        if (lower > higher) {
            return new String[0];
        }

        int length = higher - lower + 1;
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            int currentNumber = lower + i;

            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                result[i] = "Fizzbuzz";
            } else if (currentNumber % 3 == 0) {
                result[i] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(currentNumber);
            }
        }

        return result;
    }
}
