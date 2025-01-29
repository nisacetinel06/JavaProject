package org.example;

import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi = oku.nextInt();
        if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Sayı negatiftir.");
        } else {
            System.out.println("Sayı sıfırdır.");
        }
    }
}