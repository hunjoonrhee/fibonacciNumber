package org.example;

import java.util.HashMap;

public class Fibonacci {

    private HashMap<Integer, Integer> fibonacciNumbers = new HashMap<>();;

    public int getFibonacciNumber(int n){
        fibonacciNumbers = defineFibonacci();
        return fibonacciNumbers.get(n);
    }

    public HashMap<Integer, Integer> defineFibonacci(){
        fibonacciNumbers.put(0,0);
        fibonacciNumbers.put(1,1);
        int f = 0;
        for (int n=2; n<=5000; n++){
            f = fibonacciNumbers.get(n-2)+fibonacciNumbers.get(n-1);
            fibonacciNumbers.put(n, f);
        }
        return fibonacciNumbers;
    }
}
