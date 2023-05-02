package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        String[] nums = new String[higher - lower + 1];

        for (int i = 0; i < nums.length; i++) {
            boolean multipleOfThree = (i + lower) % 3 == 0;
            boolean multipleOfFive = (i + lower) % 5 == 0;

            if (multipleOfThree && multipleOfFive) {
                nums[i] = "Fizzbuzz";
            } else if (multipleOfThree) {
                nums[i] = "Fizz";
            } else if (multipleOfFive) {
                nums[i] = "Buzz";
            } else {
                nums[i] = (i + lower) + "";
            }
        }

        return nums;
    }
}
