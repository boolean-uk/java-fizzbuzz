package com.booleanuk.extension;

import java.util.ArrayList;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int range = (higher - lower) + 1;
        String[] fizzBuzz = new String[range];
        for (int i =0; i < fizzBuzz.length ; i++){
            if ((lower%3 == 0) && (lower%5== 0)){
                fizzBuzz[i] ="Fizzbuzz";
                lower++;
            } else if (lower%3 == 0) {
                fizzBuzz[i] ="Fizz";
                lower++;
            } else if (lower%5==0) {
                fizzBuzz[i] = "Buzz";
                lower++;
            }
            else {
                fizzBuzz[i] =String.valueOf(lower);
                lower++;
            }
        }

        return fizzBuzz;
    }
}
