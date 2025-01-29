package org.example;

public class LargestNumber {
    public static int enBuyukBul(int[] sayilar){
        int enBuyuk=sayilar[0];
        for (int sayi:sayilar){
            if (sayi>enBuyuk){
                enBuyuk=sayi;
            }
        }
        return enBuyuk;
    }
    public static void main(String[] args){
        int[] sayilar={2,14,43,5,67,8,76,98};
        int enBuyuk = enBuyukBul(sayilar);
        System.out.println("En büyük sayı: "+enBuyuk);
        
    }
}
