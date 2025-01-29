package org.example;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Sayı girin: ");
        int sayi = oku.nextInt();
        int orijinalSayi = sayi;
        int tersSayi = 0;
        while (sayi != 0) {
            int basamak = sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
        }
        if (orijinalSayi == tersSayi) {
            System.out.println(orijinalSayi + " palindrom sayıdır.");
        } else {
            System.out.println(orijinalSayi + " palindrom sayı değildir.");
        }
    }
}