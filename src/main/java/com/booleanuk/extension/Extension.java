package com.booleanuk.extension;

public class Extension {

    public static void main(String[] args) {
        Extension e = new Extension();
        e.fizzbuzz(1, 15);
    }
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        String[] nums = new String[Math.abs(lower-higher) + 1];
        String[] retArr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i+lower-1] = String.valueOf(i+lower);
        }

        for (int i = 0; i < nums.length; i++) {
            if (((Integer.parseInt(nums[i]) % 3) == 0) &&
                    (Integer.parseInt(nums[i]) % 5) == 0) {
                retArr[i] = "Fizzbuzz";
            } else if ((Integer.parseInt(nums[i]) % 3 == 0)) {
                retArr[i] = "Fizz";
            } else if ((Integer.parseInt(nums[i]) % 5 == 0)) {
                retArr[i] = "Buzz";
            } else {
                retArr[i] = nums[i];
            }
        }

        return retArr;
    }
}
