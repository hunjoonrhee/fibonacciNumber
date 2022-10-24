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

}