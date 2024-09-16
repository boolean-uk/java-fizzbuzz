package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int length = higher - lower + 1;
        String[] output = new String[length];

        for (int i = 0; i < length; i++)
        {
            int start = lower + i;
            if (start % 3 == 0 && start % 5 == 0)
            {
                output[i] = "Fizzbuzz";
            }
            else if (start % 3 == 0)
            {
                output[i] = "Fizz";
            }
            else if (start % 5 == 0)
            {
                output[i] = "Buzz";
            }
            else
            {
                output[i] = Integer.toString(start);
            }
        }
        return output;
    }
}
