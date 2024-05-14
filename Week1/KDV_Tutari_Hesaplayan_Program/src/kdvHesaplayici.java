import java.util.Scanner;

public class kdvHesaplayici {
    public static void main(String[] args) {
        // degişkenleri tanımladık
        double paraTutari,kdvOrani,kdvTutari,kdvDahilTutar ;
        String  kdvInfo;
        // kullanıcıdan girdi alabilmek için scanner nesnesi tanımladık
        Scanner inpTutar = new Scanner(System.in);

            System.out.println("Hesaplanacak para tutarını giriniz : ");
            paraTutari = inpTutar.nextDouble();
        // girilen tutarin aralik kontrolunu sagladik
        boolean miktarKontrol= (paraTutari>= 0 && paraTutari <=1000);

        // girilen para tutarinin miktarina gore kdv oranini belirledik
            kdvOrani = miktarKontrol ? 0.18 : 0.08;
            kdvInfo =miktarKontrol ? "%18" : "%8" ;
        // belirlenen oranı hesaplamaya dahil ettik
            kdvTutari = paraTutari*kdvOrani;
        //kdv hesaplaması sonrası tutarı girilen tutar ile topladık
            kdvDahilTutar = paraTutari+ kdvTutari;
        //kullanıcı sonucları göremesi için ekrana bastırdık
            System.out.println("KDV'siz Fiyat "+ paraTutari +"\nKDV Orani : " + kdvInfo +"\nKDV tutarı : " + kdvTutari +"\nKDV'li Fiyat  : " + kdvDahilTutar);


        }
    }
