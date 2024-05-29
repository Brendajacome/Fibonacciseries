package com.example.fibonacciseries;

import java.util.Scanner;
public class HelloApplication  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci series up to " + number + "  terms:");
        generateFibonacci(number);
        System.out.println();
    }

    public static void generateFibonacci(int number) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}