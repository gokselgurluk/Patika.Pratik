import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sicaklikDegeri;
        // kullanicidan alinacak sicakli degerini tutmak için bir değişken tanimladik
        Scanner inputSicaklik = new Scanner(System.in);
            //kullanicidan girdi alabilmek için scanner sinifini tanimladik

        System.out.print("Sıcaklık DEgerini Giriniz: ");
        sicaklikDegeri = inputSicaklik.nextInt();
            // kullanicidan sicaklik degerini istedik ve sicakliDegeri degiskenine atadik

        if(sicaklikDegeri > 25){
            System.out.print("Yüzmeye git");
            //girilen siicaklik değeri 25 den büyükse yüzme etginliğini önerir

        } else if (sicaklikDegeri >= 15 && sicaklikDegeri <= 25) {
            System.out.print("Pikniğe git");
            //girilen sıcaklik degeri 15 ile 25 arasın da ise Piknik etkinligini önerir

        } else if (sicaklikDegeri >= 5 && sicaklikDegeri <= 15) {
            System.out.print("Sinemaya  git");
            //girilen sıcaklik degeri 5 ile 15 arasın da ise Sinema etkinligini önerir

        } else if (sicaklikDegeri < 5) {
            System.out.print("Kayak yapmaya git");
            //girilen sıcaklik degeri 5 den küçük ise Kayak etkinligini önerir
        }
    }
}