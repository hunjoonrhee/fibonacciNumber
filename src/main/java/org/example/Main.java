package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int input = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.getFibonacciNumber(input);
        System.out.println("Die Fibonacci Zahl für " + input + " ist " + result);
    }
}