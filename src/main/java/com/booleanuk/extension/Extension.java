package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        String[] result = new String[higher-lower+1];
        int tmp = lower;
        for (int i=0; i< result.length; i++) {
            if (tmp % 3 == 0 && tmp % 5 == 0){
                result[i] = "Fizzbuzz";
            } else if (tmp % 3 == 0) {
                result[i] = "Fizz";
            } else if (tmp % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(tmp);
            }
            tmp++;
        }
        return result;
    }
}
