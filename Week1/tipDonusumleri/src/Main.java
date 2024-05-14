import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      int intNumber ,intDonusum ;
      double doubleNumber, doubleDonusum;
        Scanner userInp = new Scanner(System.in);
        System.out.print("Double'a Dönüştürülecek Tam Sayiyi Giriniz ");

        intNumber = userInp.nextInt();

        System.out.print("İnteger'a Dönüştürülecek Double(ondalık için virgül kullanın) Sayiyi Giriniz  ");

        doubleNumber= userInp.nextDouble();


      System.out.println("Tam Sayıyı Ondalıklı Sayıya Dönüştürme Sonucu: " + (double)intNumber);

      System.out.println("Ondalıklı Sayıyı Tam Sayıya Sönüştürme Sonucu: " + (int)doubleNumber);
    }
}