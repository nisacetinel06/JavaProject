package org.example.GetterSetter;

import org.example.CLASS.Urun;

public class Urun2 {
    private String urunAdi;
    private int fiyat;
    private int stokMiktari;

    public String getUrunAdi(){
        return urunAdi;
    }
    public void setUrunAdi(String urunAdi){
        this.urunAdi=urunAdi;
    }
    public int getFiyat(){
        return fiyat;
    }
    public void setFiyat(int fiyat){
        this.fiyat=fiyat;
    }
    public int getStokMiktari(){
        return stokMiktari;
    }
    public void setStokMiktari(int stokMiktari){
        this.stokMiktari=stokMiktari;
    }
}
class Main2{
    public static void main(String[] args){
       Urun2 urun2= new Urun2();
       urun2.setUrunAdi("Laptop");
       urun2.setFiyat(25000);
       urun2.setStokMiktari(30);
        System.out.println("Ürün adı: "+urun2.getUrunAdi()+" Fiyat: "+urun2.getFiyat()+" Stok: "+urun2.getStokMiktari());
    }
}
