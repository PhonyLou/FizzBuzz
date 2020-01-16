package com.training;

public class Main {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";


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

        if (isContain5) {
            isContain3 = false;
            isDivisible3 = false;
        }

        if (isContain3) return FIZZ;

        String result = "";
        if (isDivisible3) result += FIZZ;
        if (isDivisible5) result += BUZZ;
        if (isDivisible7) result += WHIZZ;

        return result.equals("") ? inputStr : result;
    }
}
