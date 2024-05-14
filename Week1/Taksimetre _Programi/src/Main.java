import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //hespalama için tutulacak degeler icin degiskenler tanımladik
        int mesafeKM ;
            //hesaplama icin degisken anımladik
        double tutarHsp,kmUcrt=2.20,acilisUcrt=10;
           //girdi alabilmek icin scanner nsnesi tanimladik
        Scanner girdi = new Scanner(System.in);
            // kullanıcıdan km bilgisini aldık
        System.out.println("Gidilen mesafe giriniz KM : " );
        mesafeKM = girdi.nextInt();
            //girilen mesafeye göre km ücreti ile carpıp acilis ücreti ile topladık
        tutarHsp=(mesafeKM*kmUcrt)+acilisUcrt;
            // kısa mesafe icin tutar 20 tl den az mı çok mu kontrol ettik
        tutarHsp = (tutarHsp < 20) ? 20 : tutarHsp;
            //min ucreti 20 tl belırledık fazla ise hesaplanan tutari yazdik
       // tutarHsp = tutarKntrl ? 20 : tutarHsp;
            // sonucu kullanici göremesi icin ekranan bastirdik
        System.out.println( "Km ücreti : "+kmUcrt +" TL"+"\nAçılış ücreti : "+acilisUcrt +" TL"+"\nTaksimetre Ücreti : " + tutarHsp+" TL");

        }
    }
