package com.booleanuk.extension;

import com.booleanuk.core.Exercise;

import java.util.Arrays;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int size = higher - lower + 1;
        int list[] = new int[size];
        for (int i = 0; i < size ; i++) {
            list[i] = lower + i;
        }

        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            if (list[i] % 15 == 0) {
                result[i] = "Fizzbuzz";
            } else if (list[i] == 0){
                result[i] ="0";

            }else if (list[i] % 5 == 0) {
                result[i] = "Buzz";

            } else if (list[i] % 3 == 0) {
                result[i] = "Fizz";
            } else
                result[i] = String.valueOf(list[i]);
            }

            return result;

        }
    }
//    public static void main(String[] args) {
//        Extension extenstion = new Extension("");
//        //String list[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15","30","45"};
//        System.out.println(Arrays.toString(extenstion.fizzbuzz(0,15)));
//
//    }

