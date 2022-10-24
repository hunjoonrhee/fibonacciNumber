package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void getFibonacciNumber_ShouldReturn_FibonacciNumberForGivenNumber(){
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();

        //WHEN
        int actual = fibonacci.getFibonacciNumber(5);


        //THEN
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void getFibonacciNumber_ShouldReturn_0ForInputBy0(){
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();

        //WHEN
        int actual = fibonacci.getFibonacciNumber(0);


        //THEN
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void getFibonacciNumber_ShouldReturn_1ForInputBy1(){
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();

        //WHEN
        int actual = fibonacci.getFibonacciNumber(1);


        //THEN
        int expected = 1;
        assertEquals(expected,actual);
    }

    // Testfälle für 0 und 1

}