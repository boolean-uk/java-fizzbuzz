package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int length = higher - lower + 1;
        String[] fin = new String[length];

        for (int i = 0; i < length; ++i) {
            int num = Integer.parseInt(fin[i]);
            if (num % 3 == 0 && num % 5 == 0) {
                fin[i] = "Fizzbuzz";
            } else if (num % 5 == 0) {
                fin[i] = "Buzz";
            } else if (num % 3 == 0) {
                fin[i] = "Fizz";
            } else {
                fin[i] = Integer.toString(num);

            }
        }

            return fin;
        }
    }
