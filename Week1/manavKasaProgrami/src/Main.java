import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //kullanicidan alinacak girdi için degişkenleri tanimladik
        double kgFytHsp,armut , elma ,domates ,muz,patlican  ;
    //gir almak icin scanner nesnesi tanimladik
        Scanner meyveKG = new Scanner(System.in);
    //armut kg bilgisini istedik
        System.out.print("armut kaç KG   : ");
        armut=meyveKG.nextDouble();
    //armut kilo fiyatı ile kilosunu carpıp tekrar armut degiskenine atadık
        armut *= 2.14;
        System.out.print("elma kaç KG    : ");
        elma=meyveKG.nextDouble();
        elma *= 3.67;
        System.out.print("domates kaç KG : ");
        domates=meyveKG.nextDouble();
        domates *= 1.11;
        System.out.print("muz kaç  KG    : ");
        muz=meyveKG.nextDouble();
        muz *= 0.95;
        System.out.print("patlican kaç KG: ");
        patlican=meyveKG.nextDouble();
        patlican *= 5.00;
    // meyvelrin fiyat hesaplamalarını tek bir degisken de topladık

        kgFytHsp=armut+elma+domates+muz+patlican;
    //sonucu kullaniciya göstermek icin ekrana bastirdik
        System.out.print("Toplam tutar   : "+kgFytHsp+" TL");

    }
}