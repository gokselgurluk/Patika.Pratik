import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //gerekli degiskenleri tanimladik girdiler onlaıklı olabilme ihtimali oldugu için double tanımladık

        double yariCap,alanHesap,cevreHesap,merkezAcisi;

        //scanner nesnesini tanimladik
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıcapını giriniz : ");

        yariCap = input.nextDouble();

        System.out.print("Merkez açısının ölçüsünü derece cinsinden girin: ");

        merkezAcisi = input.nextDouble();

        //Alan Formülü : π * r * r;
        //Math.PI kodu ile pi sayısını 3.14159 olarak aldık ve formule ekledik
        //daire alanını hespladik
        alanHesap = 2 * Math.PI* yariCap;
        // Çevre Formülü : 2 * π * r;
        //Math.PI kodu ile pi sayısını 3.14159 olarak aldık ve formule ekledik
        //dairenin cevresini hesapladik
        cevreHesap = Math.PI * yariCap * yariCap ;
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        //Math.PI kodu ile pi sayısını 3.14159 olarak aldık ve formule ekledik
        //Daire diliminin alanı hesapladik
        merkezAcisi = ((Math.PI*(yariCap*yariCap))*merkezAcisi)/360;
        //sonuclari kullanici göremesi için ekrana bastirdik
        System.out.println("Dairenin Alani : "+alanHesap +"\nDairenin Cevresi : "+cevreHesap+"\nDaire diliminin alanı: "+merkezAcisi);

    }
}