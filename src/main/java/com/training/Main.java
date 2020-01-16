package com.training;

import javafx.beans.binding.When;

public class Main {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";


    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(int input) {
        boolean isDivisible3 = input % 3 == 0;
        boolean isDivisible5 = input % 5 == 0;
        boolean isDivisible7 = input % 7 == 0;

        String inputStr = String.valueOf(input);
        boolean isContain3 = inputStr.contains("3");
        boolean isContain5 = inputStr.contains("5");
        boolean isContain7 = inputStr.contains("7");


        String result = "";
        if (isDivisible3) result += FIZZ;

        return result.equals("") ? inputStr : result;
    }
}
