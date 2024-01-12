package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int length = higher-lower+1;
        String[] newFizzbuzz = new String[length];

        for (int i = 0; i < length; i++) {
            newFizzbuzz[i] = String.valueOf(lower+i);
        }

        for (int i = 0; i < newFizzbuzz.length; i++) {
            if(Integer.parseInt(newFizzbuzz[i]) % 3 == 0 && Integer.parseInt(newFizzbuzz[i]) % 5 == 0){
                newFizzbuzz[i] = "Fizzbuzz";
            }
            else if(Integer.parseInt(newFizzbuzz[i]) % 3 == 0){
                newFizzbuzz[i] = "Fizz";
            }
            else if(Integer.parseInt(newFizzbuzz[i]) % 5 == 0){
                newFizzbuzz[i] = "Buzz";
            }
            else {
                System.out.println("no fizz or buzz found, continuing loop. Iteration: "+i);
            }
        }
        for (int i = 0; i < newFizzbuzz.length; i++) {
            System.out.println(newFizzbuzz[i]);
        }
        return newFizzbuzz;
    }
}
