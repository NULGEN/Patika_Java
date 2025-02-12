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
        //sifreGiris();
       // numberSort();
      //  System.out.println("Toplam tutar: " + flyerPrice());
       // cinzodiak();
       // sayiToplami();
      // faktoriyel();
        usHesaplama();

    }

    public static  void usHesaplama(){
       double total =1;

        Scanner input = new Scanner(in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int n= input.nextInt();
        System.out.print("Üs alacak sayı: ");
        int k = input.nextInt();
        total = Math.pow(n,k);

        System.out.println("Sonuc: "+ total);
    }

    public  static  void  faktoriyel(){
        System.out.println("lütfen sayi giriniz: ");
        Scanner input = new Scanner(in);
        int n = input.nextInt();
        int total=1;
       for(int i=1; i<=n; i++){
           total = total*i;
       }
        System.out.println("sonuç: " + total);
    }

    public  static  void sayiToplami(){
        Scanner input = new Scanner(in);
        int sayi;
        int total=0;
       do {
           System.out.println("Lütfen sayi giriniz: ");
           sayi = input.nextInt();
           if(sayi %4 ==0) {
               total+= sayi;
           }
       }while (sayi%2==0);

        System.out.println("Girilen sayıların toplamı: "+ total);
    }

    public static  void cinzodiak(){
        Scanner input = new Scanner(in);
        System.out.print("Doğum yılınızı giriniz : ");
        int yil = input.nextInt();
        int mod = yil % 12;
        switch (mod){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Hatalı veri girişi");






        }
    }

   public  static double  flyerPrice(){

       Scanner input = new Scanner(in);

       System.out.print("Mesafeyi km türünden giriniz : ");
       double km = input.nextDouble();
       System.out.print("Yaşınızı giriniz : ");
       int yas = input.nextInt();
       System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
       int secim = input.nextInt();
       double tutar, indirim, toplamTutar = 0;
               double yasIndirimi= 0;


       if( km > 0 && yas >= 0 && secim==1 || secim ==2){

         tutar = km * 0.10;
        if(yas >=0 && yas <12){
          yasIndirimi = tutar *0.5;
          toplamTutar = tutar- yasIndirimi;
                 if(secim ==2){
                    indirim = toplamTutar* 0.2;
                    toplamTutar = (toplamTutar-indirim)*2;
                 }
        }
        else if( yas >=12 && yas <24){
            yasIndirimi = tutar * 0.1;
            toplamTutar = tutar- yasIndirimi;
            if(secim ==2){
                indirim = toplamTutar* 0.2;
               toplamTutar = (toplamTutar-indirim)*2;
            }
        }
        else if( yas >65){
            yasIndirimi = tutar * 0.3;
            toplamTutar = tutar- yasIndirimi;
            if(secim ==2){
                indirim = toplamTutar* 0.2;
                toplamTutar = (toplamTutar-indirim)*2;
            }
        }
//           System.out.println("Toplam Tutar: "+ toplamTutar);
       }
       else{
           System.out.println("Hatalı veri girdiniz!...");
       }
       return  toplamTutar;




   }
    public  static  void numberSort(){
        int a,b,c;
        Scanner input = new Scanner(in);
        System.out.println("ilk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        c = input.nextInt();

        if((a > b) && (a> c)){
            if(b>c){
                System.out.println("a> b> c");
            }
            else {
                System.out.println("a> c> b");
            }
        } else if ((b >a) && (b>c)) {
            if(a>c){
                System.out.println("b>a>c");
            }
            else {
                System.out.println("b>c>a");
            }
        }
        else if((c>a) && (c>b)){
            if(a>b){
                System.out.println("c > a > b");
            }
            else {
                System.out.println("c > b > a");
            }
        }
        else{
            System.out.println("Lütfen tam sayı giriniz!...");
        }
        input.close();
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
