package org.example;

public class FactorialCalculation {
    public static int faktoriyel(int sayi){
        if (sayi==0 || sayi==1){
            return 1;
        }
        else{
            return sayi*faktoriyel(sayi-1);
        }
    }
    public static void main(String[] args){
        int sayi=5;
        int sonuc=faktoriyel(sayi);
        System.out.println(sayi+"!= "+sonuc);
    }
}
