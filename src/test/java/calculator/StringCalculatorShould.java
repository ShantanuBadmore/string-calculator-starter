package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }


    @Test
    void string_with_two_number(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void string_with_many_numbers(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(16, stringCalculator.add("1,2,5,8"));
    }

    @Test
    void string_with_new_line_delimeter(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2\n3"));
    }

    @Test
    void string_supporting_different_delimeter(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    void numbers_bigger_than_thousand(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(2, stringCalculator.add("2+1001"));
    }

    @Test
    void delimter_with_any_length(){
        StringCalculator stringCalculator= new StringCalculator();
        assertEquals(6, stringCalculator.add("//[***]\\n1***2***3"));
    }

    @Test
    void multiple_delimeter(){
        StringCalculator stringCalculator= new StringCalculator();
        assertEquals(6, stringCalculator.add("//[*][%]\\n1*2%3"));
    }

    @Test
    void multiple_delimeters_with_length_longer_than_one_char(){
        StringCalculator stringCalculator= new StringCalculator();
        assertEquals(6, stringCalculator.add("//[**][%%]\\n1**2%%3"));
    }

    @Test
    void count_no_of_times_add_called(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.GetCalledCount());
    }

    @Test
    void string_with_negative_numbers(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(-3, stringCalculator.add("1-3"));
    }
}