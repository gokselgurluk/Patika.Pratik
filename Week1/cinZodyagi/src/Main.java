import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int year ,zodyak;
Scanner userInput = new Scanner(System.in);

        System.out.print("Milattan Sonra Yıl bilginizi giriniz: ");
            year    = userInput.nextInt();

        if (year >= 1 ){
            //yıl bilgisinin 0 dan buyuk olmasını kontrol ettık
            zodyak = year % 12;
            //zodyak hespalamasını yılını modülünü alarak yaptık
            switch (zodyak) {
            //zodyak degişkenini kalan degerinin durumuna göre kontrol sagladık
                case 0:
                System.out.print("Çin Zodyağına: Maymun ");
                //sonucu ekrana bastırdık
                break;

                case 1:
                System.out.print("Zodyagınız: Horoz ");
                break;

                case 2:
                System.out.print("Çin Zodyağı Burcunuz: Köpek ");
                break;

                case 3:
                System.out.print("Çin Zodyağı Burcunuz: Domuz ");
                break;

                case 4:
                System.out.print("Çin Zodyağı Burcunuz: Fare ");
                break;

                case 5:
                System.out.print("Çin Zodyağı Burcunuz: Öküz ");
                break;

                case 6:
                System.out.print("Çin Zodyağı Burcunuz: Kaplan ");
                break;

                case 7:
                System.out.print("Çin Zodyağı Burcunuz: Tavşan ");
                break;

                case 8 :
                System.out.print("Çin Zodyağı Burcunuz: Ejderha ");
                break;

                case 9:
                System.out.print("Çin Zodyağı Burcunuz: Yılan ");
                break;

                case 10:
                System.out.print("Çin Zodyağı Burcunuz: At ");
                break;

                case 11:
                System.out.print("Çin Zodyağı Burcunuz: Koyun ");
                break;
            }
        }
        else{
            System.out.print("Geçersiz yıl bilgisi");
            //yıl bilgisi 1 den güçükse hata verir
        }
    }
}