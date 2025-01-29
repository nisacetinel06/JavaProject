package org.example.GetterSetter;

class Ogrenci2 {
     private String isim;
     private int yas;
     public String getIsim(){
         return isim;
     }
     public void setIsim(String isim){
         this.isim=isim;
     }
     public int getYas(){
         return yas;
     }
     public void setYas(int yas){
         this.yas=yas;
     }

}
class Main{
    public static void main(String[] args){
        Ogrenci2 ogrenci2=new Ogrenci2();
        ogrenci2.setIsim("Nisa");
        ogrenci2.setYas(20);
        System.out.println("Öğrencinin adı: "+ogrenci2.getIsim());
        System.out.println("Öğrencinin yaşı: "+ogrenci2.getYas());
    }
}
