package org.example;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle=oku.nextLine();
        System.out.print("Cümle uzunluğu: "+cumle.length());
}
}
