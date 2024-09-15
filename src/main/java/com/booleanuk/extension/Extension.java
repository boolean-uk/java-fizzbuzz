package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        int arrayLength = higher - lower + 1;
        String[] nums = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            nums[i] = String.valueOf(lower + i);
        }

        final int       DIGIT1  = 3;
        final int       DIGIT2  = 5;
        final String    WORD1   = "Fizz";
        final String    WORD2   = "Buzz";
        final String    SAME    = "Fizzbuzz";

        int[] intNums = new int[nums.length];
        for(int i = 0; i < intNums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i]);
        }
        for(int i = 0; i < intNums.length; i++) {
            if(intNums[i] % DIGIT1 == 0 && intNums[i] % DIGIT2 == 0) {
                nums[i] = SAME;

            }
            if(intNums[i] % DIGIT1 == 0 && intNums[i] % DIGIT2 != 0) {
                nums[i] = WORD1;

            }
            if(intNums[i] % DIGIT1 != 0 && intNums[i] % DIGIT2 == 0) {
                nums[i] = WORD2;
            }
        }
        return nums;
    }
}
