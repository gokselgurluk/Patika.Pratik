import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Scanner userInput = new Scanner(System.in);
      int number ,sum=0, count = 0;//sum =Toplamı tutmak için bir değişken oluşturuyoruz
                                    //count= Sayıları saymak için bir sayaç oluşturuyoruz
        System.out.println("bir sayı giriniz");
        number=userInput.nextInt();

        for(int i = 1 ; i<= number ;i++) {//i 1 de başlattık çünkü 0 a bölünmesi durumun da sayac 1 deger 0 olucaktır

            if (i % 3 == 0 && i % 4 == 0 ) {// 3'e ve 4'e tam bölünebilen sayıları kontrol ediyoruz
                sum  += i;  // Her bir tam bölünen sayıyı toplam değişkenine ekliyoruz
                count ++;
            }
        }
         if (count > 0) {// bölünen sayı bulunduysa
             sum /= count;//Ortalamayı hesaplıyoruz
             System.out.println("0 ile " + number + " arasındaki 3 ve 4'e tam bölünen sayıların ortalaması: \n" + sum);
         }
         else {
             System.out.println("Bölünen sayı bulunamadı");
         }
}

    }
