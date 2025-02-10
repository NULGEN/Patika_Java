package edu.patika.java101;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Patika {
    public static void main(String[] args) {
        notOrtalaması();
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
