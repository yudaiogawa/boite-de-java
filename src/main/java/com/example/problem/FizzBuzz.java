package com.example.problem;

class FizzBuzz {

    String convert(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}
