package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int size = Math.abs(higher - lower) + 1;
        String[] nums = new String[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.toString(lower);
            lower += 1;
        }

        int number;
        for (int i = 0; i < nums.length; i++) {
            number = Integer.parseInt(nums[i]);
            if (number % 3 == 0 || number % 5 == 0) {
                if (number % 5 != 0) {
                    nums[i] = "Fizz";
                } else if (number % 3 != 0) {
                    nums[i] = "Buzz";
                } else {
                    nums[i] = "Fizzbuzz";
                }
            }
        }
        return nums;
    }

   /*public void print() {
        String[] fizz = fizzbuzz(1, 15);

        for (int i = 0; i < fizz.length; i++) {
            System.out.println(fizz[i]);
        }
    }

    public static void main(String[] args) {
        Extension ex = new Extension();
        ex.print();
    }*/
}
