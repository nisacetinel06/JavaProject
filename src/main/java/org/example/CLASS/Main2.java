package org.example.CLASS;

public class Main2 {
    public static void main(String[] args){
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.isim="Nisa";
        ogrenci.yas=20;
        ogrenci.bolum="Bilgisayar Mühendisliği";
        ogrenci.bilgileriYazdir();

        Hesaplama hesaplama= new Hesaplama();
        hesaplama.sayi1=10;
        hesaplama.sayi2=8;
        hesaplama.toplama();
        hesaplama.cikarma();

        Mesaj mesaj= new Mesaj();
        mesaj.gonderen="Esma";
        mesaj.alici="Nisa";
        mesaj.mesaj="İyi misin?";
        mesaj.mesajGonder();

        Matematik matematik= new Matematik();
        matematik.sayi=9;
        matematik.karesi();
        matematik.kupu();

        Urun urun= new Urun();
        urun.urunAdi="Laptop";
        urun.fiyat=25000;
        urun.stokMiktari=50;
        urun.urunBilgisi();
    }
}
