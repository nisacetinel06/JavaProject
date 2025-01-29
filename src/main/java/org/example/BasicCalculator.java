package org.example;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. Sayıyı girin: ");
        int sayi1 = oku.nextInt();
        System.out.print("2. Sayıyı girin: ");
        int sayi2 = oku.nextInt();
        System.out.println("Toplama işlemi sonucu: " + (sayi1 + sayi2));
        System.out.println("Çıkarma işlemi sonucu: " + (sayi1 - sayi2));
        System.out.println("Çarpma işlemi sonucu: " + (sayi1 * sayi2));
        System.out.println("Bölme işlemi sonucu: " + (sayi1 / sayi2));
    }
}
