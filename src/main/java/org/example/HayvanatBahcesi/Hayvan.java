package org.example.HayvanatBahcesi;

public class Hayvan {
    String isim;
    int yas;
    public Hayvan(String isim,int yas){
        this.isim=isim;
        this.yas=yas;
    }
    public void bilgiGoster(){
        System.out.println("Hayvanın ismi: "+isim+" Yaşı: "+yas);
    }
}
class Etcil extends Hayvan{
    String avlanmaYontemi;
    public Etcil(String isim, int yas, String avlanmaYontemi){
        super(isim,yas);
        this.avlanmaYontemi=avlanmaYontemi;
    }
    @Override
    public void bilgiGoster(){
        super.bilgiGoster();
        System.out.println("Avlanma Yöntemi: "+avlanmaYontemi);
    }
}
class Otcul extends Hayvan{
    String beslenmeAlani;
    public Otcul(String isim, int yas, String avlanmaYontemi,String beslenmeAlani){
        super(isim,yas);
        this.beslenmeAlani=beslenmeAlani;
    }
    @Override
    public void bilgiGoster(){
        super.bilgiGoster();
        System.out.println("Beslenme Alanı: "+beslenmeAlani);
    }
}
class Main{
    public static void main(String[] args){
        // Etcil hayvan
        Etcil aslan = new Etcil("Aslan",4,"Pusu");

        // Otcul hayvan
        Otcul geyik = new Otcul("Geyik", 3, "Pusu", "Çayır");


        // Hayvanların bilgilerini yazdır
        System.out.println("=== Hayvan Bilgileri ===");
        aslan.bilgiGoster();
        System.out.println();
        geyik.bilgiGoster();


    }
}

