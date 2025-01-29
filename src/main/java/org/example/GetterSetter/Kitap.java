package org.example.GetterSetter;

public class Kitap {
    private String kitapAdi;
    private String yazarAdi;
    private int sayfaSayisi;

    public String getKitapAdi(){
        return kitapAdi;
    }
    public void setKitapAdi(String kitapAdi){
        this.kitapAdi=kitapAdi;
    }
    public String getYazarAdi(){
        return yazarAdi;
    }
    public void setYazarAdi(String yazarAdi){
        this.yazarAdi=yazarAdi;
    }
    public int getSayfaSayisi(){
        return sayfaSayisi;
    }
    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi=sayfaSayisi;
    }
}
class Main3{
    public static void main(String[] args){
        Kitap kitap=new Kitap();
        kitap.setKitapAdi("İçimizdeki Şeytan");
        kitap.setYazarAdi("Sabahattin Ali");
        kitap.setSayfaSayisi(304);
        System.out.println("Kitap adı: "+kitap.getKitapAdi()+" Yazar adı: "+kitap.getYazarAdi()+" Sayfa sayısı: "+kitap.getSayfaSayisi());
    }
}
