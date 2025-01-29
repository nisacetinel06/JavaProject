package org.example;

import java.util.Scanner;

public class DivisorsFinder {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = oku.nextInt();
        System.out.println(sayi + " 'nın tüm çarpanları: ");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(i);
            }
        }
    }
}