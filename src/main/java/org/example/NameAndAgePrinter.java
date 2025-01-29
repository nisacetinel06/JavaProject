package org.example;

import java.util.Scanner;

public class NameAndAgePrinter {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Adınızı girin: ");
        String isim = oku.nextLine();
        System.out.print("Yaşınızı girin: ");
        int yas = oku.nextInt();
        System.out.println("İsminiz: "+isim+" Yaşınız: "+yas);}}

