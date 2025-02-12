package edu.patika.java101;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Patika {
    public static void main(String[] args) {
        // notOrtalaması();
       // kdvTutari();
       // alanHesapla();
       // taksimetre();
       // daire();
        //manavKasa();
       // hesapMakinasi();
        sifreGiris();

    }
    public static void sifreGiris(){
        String username, sifre;
        Scanner input = new Scanner(in);
        System.out.print("Kullanıcı Adınız: ");
        username = input.nextLine();
        System.out.print("Şifreniz: ");
        sifre = input.nextLine();

        if(username.equals("patika") && sifre.equals("java123")){
            System.out.println("Hoşgeldiniz, giriş başarılı..");
        }
        else{
            System.out.println("Hatalı giriş yaptınız!..");
        }
    }
    public static void hesapMakinasi(){
        System.out.println("Lütfen yapmak istediğiniz işlemi griniz: ");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        Scanner input = new Scanner(in);
        int giris = input.nextInt();
        System.out.print("Birinci sayi: ");
        double first = input.nextDouble();
        System.out.print("İkinci sayi: ");
        double second = input.nextDouble();
        double sonuc;
       switch (giris){
           case 1:
               sonuc= first + second;
               System.out.println( "İşlem sonucu: "+ sonuc);
               break;
           case 2 :
               sonuc = first - second;
               System.out.println( "İşlem sonucu: "+ sonuc);
           break;
           case 3:
               sonuc = first * second;
               System.out.println( "İşlem sonucu: "+ sonuc);
               break;
           case 4:
               sonuc = (first==0 || second==0) ? 0: (first/second);
               System.out.println( "İşlem sonucu: "+ sonuc);
               break;
           default:
               System.out.println("Yanlış işlem yaptınız tekrar deneyiniz");
       }
       input.close();





    }

    public  static void  manavKasa(){
       Scanner input = new Scanner(in);
        double armut= 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;

        System.out.println("Armut Kaç Kilo ? ");
       double armutKg = input.nextDouble();
       System.out.println("Elma Kaç Kilo ? ");
        double elmaKg = input.nextDouble();

        System.out.println("Domates Kaç Kilo ? ");
      double domatesKg = input.nextDouble();

        System.out.println("Muz Kaç Kilo ? ");
       double muzKg = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? ");
       double patlicanKg = input.nextDouble();

        Double toplam = elmaKg*elma + armutKg*armut + muzKg* muz +patlicanKg*patlican + domatesKg*domates;

        System.out.println("Toplam Tutar: "+ toplam+ " TL ");
    }
    public  static void  daire(){
        Scanner input = new Scanner(in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        double yariCap = input.nextDouble();
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        double aci = input.nextDouble();

        double cevre = Math.PI*2*yariCap;
        double alan = Math.PI * Math.pow(yariCap,2);
        double dilimAlan = (3.14* Math.pow(yariCap,2)*aci)/360;

        System.out.println("Dairenin cevresi: " + String.format("%.2f",cevre));
        System.out.println("Dairenin alanı: "+ String.format("%.2f",alan));
        System.out.println("Dairenin merkez açı ölçüsü: "+ String.format("%.2f", dilimAlan));


    }
    public  static void taksimetre(){
        double km, price, total;

        Scanner input   = new Scanner(in);
        System.out.println("Girilen km değerini giriniz: ");
        km = input.nextDouble();
        price = km* 2.2;
        total = price+10;

      total=   (price <20) ? 20: total;

        System.out.println("Toplam tutar: "+ total);
    }

    public static void alanHesapla(){
        Scanner input = new Scanner(in);
        System.out.println("Üçgenin ilk kenar uzunluğunu giriniz: ");
        int ilKenar = input.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        int ikinciKenar = input.nextInt();

        double hipotenus;

        hipotenus = Math.sqrt(Math.pow(ilKenar,2) + Math.pow(ikinciKenar,2));
        System.out.println("Üçgenin hipotenüsü : " + hipotenus);


    }

    public  static void kdvTutari(){
        Scanner input = new Scanner(in);
        System.out.println("Lütfen para miktarını belirtiniz: ");
        double para = input.nextDouble();
        double tutar;

        if(para >0 && para <1000){
            System.out.println("KDV'siz Fiyat = "+ para);
            tutar = para+ (para * 18/100);
            System.out.println("KDV'li Fiyat = " + String.format("%.2f", tutar));
            System.out.println("KDV tutarı = "+ String.format("%.2f", tutar-para));
        }
        else if(para>=1000){
            System.out.println("KDV'siz Fiyat = "+ para);
            tutar = para+ (para * 8/100);
            System.out.println("KDV'li Fiyat = " + String.format("%.2f", tutar));
            System.out.println("KDV tutarı = "+ String.format("%.2f", tutar-para));
        }
    }
    public static void notOrtalaması(){
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner input = new Scanner(in);
        System.out.println("Matematik sınav puanını giriniz: ");
        int math = input.nextInt();
        notlar.add(math);
        System.out.println("Fizik sınav puanını giriniz: ");
        int physic = input.nextInt();
        notlar.add(physic);
        System.out.println("Kimya sınav puanını giriniz: ");
        int chemist = input.nextInt();
        notlar.add(chemist);
        System.out.println("Türkçe sınav puanını giriniz: ");
        int turkish = input.nextInt();
        notlar.add(turkish);
        System.out.println("Tarih sınav puanını giriniz: ");
        int history = input.nextInt();
        notlar.add(history);
        System.out.println("Müzik sınav puanını giriniz: ");
        int music = input.nextInt();
        notlar.add(music);

        int sayi = notlar.size();
        int total = notlar.stream().reduce(0,(a,b)-> a+b);
        double ortalama = total/sayi;
        System.out.println("Not ortalaması: "+ ortalama);
        System.out.println(ortalama>60 ? "Sınıfı geçti ": "Sınıfta Kaldı ");

    }
}
