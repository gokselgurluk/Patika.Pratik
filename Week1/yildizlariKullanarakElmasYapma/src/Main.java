
/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.print("Yıldız Satır Sayısını Giriniz :");
        int n = star.nextInt() ;

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i -1 ); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //yıldızların tersini yapıyoruz
            //1.koşul;2.koşull;3.koşul
        for (int i = n; i >= 1; i--) {//girilen n sayısı kadar i yi 1'e esıt olana kadar eksıltıyoruz
            for (int j =(n-i); j >=1; j--){// j nın degerıni gırılen n sayısının i den cıkarılması ile j de nin başlangıc degerini elde ediyoruz
                System.out.print(" ");     //bu bize j nın ne kadar donecegını verır baslangıcda i dongusu n den basladıgı için
            }                               //fark azdan coga gıdecektır ornegın n=6 , i=5 olsun 6-5 =1 yapar j döngüsü 1 kere doner ve 1 boşluk atar
        for (int k =(2 * i - 1) ; k >= 1; k--) { //j ile aynı mantık k nın başlangıc degeri i nin 2 katının 1 eksiginden baslar k 1'e esıt olana kadar doner
                System.out.print("*");          // örneğin i=5 olsun k=2*5-1 ,k=9 döngu 9 dan basylayıp 1 azalacak  k dongusu 9 kere donmus olacak
            }                                   // bu da bize 9 kere yıldız yazdırmamızı saglar
                System.out.println(" "); // kıscası 2. kosul 1. kosula 1. kosul da 2. kosula yazılıp dongu 1 azaltılırsa tersı elde edılır
            }
                System.out.println("program sonlandı");
    }
}