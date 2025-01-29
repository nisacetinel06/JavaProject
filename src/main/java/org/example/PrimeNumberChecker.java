package org.example;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi= oku.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <sayi; i++) {
            if(sayi%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
    }
}
