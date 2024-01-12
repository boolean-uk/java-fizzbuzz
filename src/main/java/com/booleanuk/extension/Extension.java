package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int index = 0;
        String[] fizzedBuzzed = new String[higher-lower+1];
        for(int i = lower; i <= higher; i++)
        {
            if(i % 15 == 0) fizzedBuzzed[index] = "Fizzbuzz";
            else if (i % 5 == 0) fizzedBuzzed[index] = "Buzz";
            else if (i % 3 == 0) fizzedBuzzed[index] = "Fizz";
            else fizzedBuzzed[index] = "" + i;
            index++;
        }


        return fizzedBuzzed;
    }
}
