package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        String[] arr = new String[higher-lower +1];

        int j = lower;
        for (int i = 0 ; i <= higher-lower; i++) {
            arr[i] = Integer.toString(j);
            j++;
        }


        for (int i = 0; i < arr.length; i++) {
            int number = 0;
            number = Integer.parseInt(arr[i]);
            if (number % 5 == 0 && number % 3 ==0) {
                arr[i] = "Fizzbuzz";
            } else if (number % 5 == 0) {
                arr[i] = "Buzz";
            } else if (number % 3 == 0) {
                arr[i] = "Fizz";
            }
        }



        return arr;
    }
}
