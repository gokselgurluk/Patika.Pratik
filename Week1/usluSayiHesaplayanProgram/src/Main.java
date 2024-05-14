import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sum=1 , x,y ;

        Scanner enter =new Scanner(System.in);

        System.out.print("taban sayiyisini giriniz: ");//// Üssü alınacak sayı x'e atıyoruz
            x=enter.nextInt();
        System.out.print("üs sayiyisini giriniz: ");// Üs değeri degişkenini y'e atıyoruz
             y=enter.nextInt();

        for(int i=1; i<=y;i++) {//girilen  Üs değeri kadar döngü dönecek
            sum *= x;           // her döndügün de sayının kendisi ile çarpılacak ve sonuc sum a atıyacak

        }
        System.out.println("İşlemin sonucu: "+sum   );//sonucu kullanıcıya yazdırmak üzere ekrana bastıralacak
    }
}