import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanicidan alinan sayıları tutmak icin degiskenleri tanimladik
        int aKenari, bKenari , cKenari;
        // hesaplama icin gerekli olan degiskenleri tanimladik
      double alanHesap,cevreHesaplama,yariCevre ;

        //girdi islemi icin scanner nesnesi tanimladik
    Scanner girdi = new Scanner(System.in);

        // ücgenin 3 kenarinin uzunluk bilgilerini kullanicidan istedik
        System.out.println("a kenarı uzunluğu");
        aKenari =girdi.nextInt();
        System.out.println("b kenarı uzunluğu");
        bKenari =girdi.nextInt();
        System.out.println("c kenarı uzunluğu");
        cKenari =girdi.nextInt();

        //ucgenin cevre hesaplamasi = (a+b+c)
        cevreHesaplama =(aKenari+bKenari+cKenari);
        //ucgenin yari cevresi hesaplamasi = (a+b+c) / 2
        yariCevre =((aKenari+bKenari+cKenari)/2.0);
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        //ucgenin alan formulune gore gerekli hesaplamayi yaptık
        alanHesap =Math.sqrt(yariCevre * ((yariCevre - aKenari)* (yariCevre - bKenari) * (yariCevre - cKenari)));
        // sonucu kullanıcıya göstermek icin ekrana bastirdik

        System.out.println("Ücgenin Çevresi : " + cevreHesaplama + "\nÜcgenin Alanı   : " + alanHesap + " m²");


        }
    }
