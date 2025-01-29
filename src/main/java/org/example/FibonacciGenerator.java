package org.example;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int n = oku.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci serisi: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}