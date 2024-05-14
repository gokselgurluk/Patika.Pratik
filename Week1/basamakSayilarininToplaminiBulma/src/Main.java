import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,digitCount,total=0;
        ///: 1643 = 1 + 6 + 4 + 3 = 14
        Scanner enter =new Scanner(System.in);

        System.out.println("Bir sayı giriniz1");
        number = enter.nextInt();

        while (number !=0){ // girilen sayı 0 dan farklı olana kadar döngü dönecek
        digitCount=number % 10; // sayının kalanını alarak son basamagını bulduk
                 number /= 10; // sayıyı 10 bolerek basamak sayısını azalttık
            total+=digitCount; // buldugumuz basamak degerını bır oncekı basamak degerı ıle topalyıp total
                                    //degıskenıne atadık
        }
        System.out.println("Sayının basamak sayılarının toplamı: "+total);
        // sonucu kullanıcıya göstermek için ekrana bastırdık
    }
}