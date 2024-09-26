package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        String[] arr = new String[higher - lower + 1]; //Subtract lower from higher,
        // e.g. 10 - 5, length is 5 (5,6,7,8,9), but to include the number "higher" (10) ) 1 is added


        for(int i = 0; i < arr.length; i++) { //e.g. higher is 10, lower is 5, arr.length == 5
            arr[i] = String.valueOf(lower); //The values in arr[] get filled with the value of 5
            lower++; //lower (5) incremented until it's less than 10,
        }
        //The reason for the loop above is the fill the array with values so it's not empty
        // when looped through in the loop below, otherwise arr[] will be empty and the loop below
        // loops through an empty array while searching for numbers that are multiples of 3,5 etc.

        for(int i = 0; i < arr.length; i++) { //This for loop tests the values in the arr[] (filled in the for loop above)
                                                // and does the multiples check

            int indexValue = Integer.parseInt(arr[i]);

            if(indexValue % 3 == 0 && indexValue % 5 == 0) { // %
                arr[i] = "Fizzbuzz";
            }
            else if(indexValue % 5 == 0) {
                arr[i] = "Buzz";
            }
            else if(indexValue % 3 == 0) {
                arr[i] = "Fizz";
            }
        }


        return arr;
    }
}
