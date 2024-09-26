package com.booleanuk.extension;

public class Extension {

    private final int fizz = 3;
    private final int buzz = 5;

    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */

        String[] _outStr = new String[higher - lower + 1];

        for (int i = 0; i < _outStr.length; i++) {
            int _target = lower + i;

            if (_target % (fizz * buzz) == 0)
                _outStr[i] = "Fizzbuzz";
            else if (_target % buzz == 0)
                _outStr[i] = "Buzz";
            else if (_target % fizz == 0)
                _outStr[i] = "Fizz";
            else
                _outStr[i] = "" + _target;
        }

        return _outStr;
    }
}
