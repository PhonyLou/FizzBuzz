package com.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void fizzBuzz_is_3() {
        //given
        int input = 3;
        String except = "Fizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_3_multiples() {
        //given
        int input = 6;
        String except = "Fizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);

        //given
        int input2 = 9;
        //when
        String actual2 = Main.fizzBuzz(input2);
        //then
        assertEquals(except, actual2);
    }

    @Test
    public void fizzBuzz_is_5_multiples() {
        //given
        int input = 5 * 2;
        String except = "Buzz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_7_multiples() {
        //given
        int input = 7;
        String except = "Whizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_3_5_multiples() {
        //given
        int input = 3 * 5 * 4;
        String except = "FizzBuzz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_3_7_multiples() {
        //given
        int input = 3 * 7;
        String except = "FizzWhizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_5_7_multiples() {
        //given
        int input = (5 * 7) * 3;
        String except = "BuzzWhizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_3_5_7_multiples() {
        //given
        int input = 3 * 5 * 7 * 2;
        String except = "FizzBuzzWhizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_contain_3() {
        //given
        int input = 13;
        String except = "Fizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_contain_5() {
        //given
        int input = 35;
        String except = "BuzzWhizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);
    }

    @Test
    public void fizzBuzz_is_contain_7() {
        //given
        int input = 75;
        String except = "Fizz";
        //when
        String actual = Main.fizzBuzz(input);
        //then
        assertEquals(except, actual);

        int input2 = 7;
        String except2 = "Whizz";
        String actual2 = Main.fizzBuzz(input2);
        assertEquals(except2, actual2);
    }

}
