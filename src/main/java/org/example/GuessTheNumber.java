package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Random random = new Random();
        int rastgelesayilar = random.nextInt(100) + 1;
        int tahmin;
        do {
            System.out.println("Sayıyı tahmin ediniz: ");
            tahmin = oku.nextInt();
            if (tahmin > rastgelesayilar) {
                System.out.println("Daha küçük bir sayi girin.");
            } else if (tahmin < rastgelesayilar) {
                System.out.println("Daha büyük sayılar girin.");
            }
        }
        while (tahmin != rastgelesayilar);
        System.out.println("Tebrikler, doğru tahmin! " + rastgelesayilar);

    }
}