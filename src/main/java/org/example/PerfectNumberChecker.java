package org.example;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı:");
        int sayi = oku.nextInt();
        int total = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total = total + i;
            }
        }
        if (total == sayi) {
            System.out.println("Mukemmel sayı");
        } else {
            System.out.println("Mukemmek sayı değildir.");
        }
    }
}
