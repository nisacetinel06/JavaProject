package org.example.AracYonetimSistemi;


class Arac {
    String marka;
    String model;
    int yil;
    //parametreli yapıcı
    public Arac(String marka,String model, int yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }
    public void bilgileriGoster(){
        System.out.println("Marka: "+ marka);
        System.out.println("Model: "+model);
        System.out.println("Yıl: "+yil);
    }

}
class Araba extends Arac{
    int kapiSayisi;
    //Parametreli yapıcı
    public Araba (String marka,String model, int yil,int kapiSayisi){
        super(marka,model,yil);
        this.kapiSayisi=kapiSayisi;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kapı sayısı: "+kapiSayisi);
    }
    public void calistir(){
        System.out.println(marka + " " + model + " çalıştırıldı.");
    }
}


class Main{
    public static void main(String[] args){
        Araba araba=new Araba("Toyota","Corolla",2020,4);
        araba.bilgileriGoster();
        araba.calistir();
    }
}
