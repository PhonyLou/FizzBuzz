package com.training;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(int input) {

        String inputStr = String.valueOf(input);

        if (inputStr.contains("3")) {
            return "Fizz";
        }

        if (input % (3 * 5 * 7) == 0) {
            return "FizzBuzzWhizz";
        }

        if (input % (5 * 7) == 0) {
            return "BuzzWhizz";
        }

        if (input % (3 * 7) == 0) {
            return "FizzWhizz";
        }

        if (input % (3 * 5) == 0) {
            return "FizzBuzz";
        }

        if (input % 3 == 0) {
            return "Fizz";
        }

        if (input % 5 == 0) {
            return "Buzz";
        }


        if (input % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(input);
    }
}
