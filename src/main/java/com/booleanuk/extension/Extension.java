package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */
        int maxLen = higher-lower;
        String[] firstArray = new String[maxLen+1];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = String.valueOf(lower);
            lower++;
        }
        String[] newArray = new String[firstArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if(Integer.parseInt(firstArray[i])%3==0 & Integer.parseInt(firstArray[i])%5!=0){
                newArray[i] = "Fizz";
            }else if(Integer.parseInt(firstArray[i])%5==0 & Integer.parseInt(firstArray[i])%3!=0){
                newArray[i]="Buzz";
            }else if(Integer.parseInt(firstArray[i])%5==0 & Integer.parseInt(firstArray[i])%3==0){
                newArray[i]="Fizzbuzz";
            }else{
                newArray[i]=firstArray[i];
            }

        }


        return newArray;
    }
}
