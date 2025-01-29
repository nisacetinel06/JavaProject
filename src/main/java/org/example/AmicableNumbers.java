package org.example;

import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı 1: ");
        int sayi1 = oku.nextInt();
        System.out.println("Sayı 2: ");
        int sayi2 = oku.nextInt();
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if (sayi1 == total2) {
            if (sayi2 == total1) {
                System.out.println("Arkadas sayı");
            }
        }
    }
}

