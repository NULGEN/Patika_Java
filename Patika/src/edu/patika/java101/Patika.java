package edu.patika.java101;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Patika {
    public static void main(String[] args) {
        //notOrtalaması();
        kdvTutari();
    }
    public  static  void kdvTutari(){
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
