package com.booleanuk.extension;

import com.booleanuk.core.Exercise;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        higher++;
        int arrayLength = higher - lower;
        String[] nums = new String[arrayLength];
        int idx = 0;

        for (int i = lower; i < higher; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                nums[idx] = "Fizzbuzz";
            }
            else if (i % 3 == 0){
                nums[idx] = "Fizz";
            }
            else if (i % 5 == 0){
                nums[idx] = "Buzz";
            }
            else
                nums[idx] = Integer.toString(i);
            idx++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Extension fizz = new Extension();
        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] ans = fizz.fizzbuzz(1, 15);
        int arrayLength = 15 - 1;

        for (int i = 0; i < arrayLength; i++){
            System.out.println(ans[i]);
        }
    }
}
