import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // degiskenleri tanımladik
        double boy,kilo ,indeksHesap;
    // kullanicididan girdi alabilmek için scanner nesnesini tanımladik
        Scanner indeksVerisi = new Scanner(System.in);
    //boy bilgisini aldık
        System.out.println("Boyunuzu (metere cinsinde) giriniz: ");
            boy = indeksVerisi.nextDouble();
    //kilo bilgisini aldık
        System.out.println("Kilonuzu (Kg cinsinden) giriniz: ");
            kilo = indeksVerisi.nextDouble();
     // VKİ FORMÜLÜ = Kilo (kg) / Boy(m) * Boy(m)
            indeksHesap = kilo / (boy * boy);
    // sonucu kullaniciya göstermek için ekrana bastirdik
        System.out.println("Vücut Kitle İndeksiniz "+indeksHesap);


    }
}